package dao.account

import db.DatabaseFactory
import dto.account.AccountDTO
import entities.account.AccountEntity
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.selectAll

object AccountDAO {
    suspend fun getAll() : List<AccountDTO> = DatabaseFactory.dbQuery {
        AccountEntity.selectAll().map { mapToDTO(it) }
    }

    suspend fun getById(id: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun mapToDTO(row: ResultRow) : AccountDTO =
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