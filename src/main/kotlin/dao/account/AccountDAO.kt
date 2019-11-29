package dao.account

import dao.AbstractDAO
import dao.BaseDAO
import db.DatabaseFactory
import dto.BaseDTO
import dto.account.AccountDTO
import entities.account.AccountEntity
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.selectAll

object AccountDAO : BaseDAO<AccountDTO> {
    override suspend fun getById(id: Int): AccountDTO? = DatabaseFactory.dbQuery {
        AccountEntity.select {
            (AccountEntity.id eq id)
        }.mapNotNull { mapToDTO(it) }
            .singleOrNull()
    }

    override suspend fun getAll(): List<AccountDTO>? = DatabaseFactory.dbQuery {
        AccountEntity.selectAll().map { mapToDTO(it) }
    }

    override suspend fun create(dataObject: AccountDTO) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun update(dataObject: AccountDTO): AccountDTO {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun deleteById(entityId: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
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