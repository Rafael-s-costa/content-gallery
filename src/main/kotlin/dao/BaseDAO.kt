package dao

import db.DatabaseFactory
import entities.service.ServiceEntity
import org.jetbrains.exposed.dao.IntIdTable
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.selectAll

abstract class BaseDAO {
    suspend fun getAll(entity: Table) = DatabaseFactory.dbQuery {
        entity.selectAll().map { mapToDTO(it) }
    }

    abstract fun mapToDTO(row: ResultRow)
}