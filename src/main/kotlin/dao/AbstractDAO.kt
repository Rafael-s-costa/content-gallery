package dao

import db.DatabaseFactory
import dto.BaseDTO
import dto.account.AccountDTO
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.selectAll

abstract class AbstractDAO<T, V> {
    /*suspend fun getById(entity: Table, id: Int) : V = DatabaseFactory.dbQuery {
        entity.select {
            (entity.id eq id)
        }.mapNotNull { mapToDTO(it) }
            .singleOrNull()
    }

    suspend fun getAll(entity: Table) : List<V> = DatabaseFactory.dbQuery {
        entity.selectAll().map { mapToDTO(it) }
    }*/
    // WIP
}