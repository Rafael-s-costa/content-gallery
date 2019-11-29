package dao

import dto.BaseDTO
import org.jetbrains.exposed.sql.ResultRow
import java.io.Serializable

interface BaseDAO<T> {
    suspend fun getById(id: Int): T?
    suspend fun getAll(): List<T>?
    suspend fun create(dataObject: T): T?
    suspend fun update(dataObject: T): T?
    suspend fun deleteById(entityId: Int): Boolean
    fun mapToDTO(row: ResultRow): T
}
