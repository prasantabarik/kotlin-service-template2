package com.tcs.service.repository

import com.tcs.service.model.BaseModel
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface BaseRepository : MongoRepository<BaseModel, String> {

    fun findByModId(modId: String): BaseModel
}