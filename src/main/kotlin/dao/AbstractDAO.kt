package dao

import db.DatabaseFactory
import entities.service.ServiceEntity
import org.jetbrains.exposed.dao.IntIdTable
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.selectAll

abstract class AbstractDAO {
    suspend fun getAll(entity: Table) : List<AbstractDAO> = DatabaseFactory.dbQuery {
        entity.selectAll().map { mapToDTO<AbstractDAO>(it) }
    }

    abstract fun<T: AbstractDAO> mapToDTO(row: ResultRow): T
}