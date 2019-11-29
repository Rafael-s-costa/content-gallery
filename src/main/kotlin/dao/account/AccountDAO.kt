package dao.account

import dao.BaseDAO
import db.DatabaseFactory.dbQuery
import dto.account.AccountDTO
import entities.account.AccountEntity
import org.jetbrains.exposed.sql.*

object AccountDAO : BaseDAO<AccountDTO> {
    override suspend fun getById(id: Int): AccountDTO? = dbQuery {
        AccountEntity.select {
            (AccountEntity.id eq id)
        }.mapNotNull { mapToDTO(it) }
            .singleOrNull()
    }

    override suspend fun getAll(): List<AccountDTO>? = dbQuery {
        AccountEntity.selectAll().map { mapToDTO(it) }
    }

    override suspend fun create(dataObject: AccountDTO): AccountDTO? {
        var key = 0
        dbQuery {
            key = (AccountEntity.insert {
                it[username] = dataObject.username
                it[email] = dataObject.email
                it[pwd] = dataObject.pwd
            } get AccountEntity.id)
        }
        return getById(key)!!
    }

    override suspend fun update(dataObject: AccountDTO): AccountDTO? {
        val id = dataObject.id
        return if (id == null) {
            create(dataObject)
        } else {
            dbQuery {
                AccountEntity.update({ AccountEntity.id eq id }) {
                    it[username] = dataObject.username
                    it[email] = dataObject.email
                    it[pwd] = dataObject.pwd
                }
            }
            getById(id)
        }
    }

    override suspend fun deleteById(id: Int): Boolean {
        return dbQuery {
            AccountEntity.deleteWhere { AccountEntity.id eq id } > 0
        }
    }

    override fun mapToDTO(row: ResultRow): AccountDTO =
        AccountDTO(
            id = row[AccountEntity.id],
            username = row[AccountEntity.username],
            email = row[AccountEntity.email],
            pwd = row[AccountEntity.pwd],
            serviceId = row[AccountEntity.serviceId],
            followers = row[AccountEntity.followers],
            rating = row[AccountEntity.rating],
            cdate = row[AccountEntity.cdate],
            mdate = row[AccountEntity.mdate]
        )
}