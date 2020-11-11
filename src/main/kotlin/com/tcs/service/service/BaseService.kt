package com.tcs.service.service

import com.tcs.service.constant.ExceptionMessage
import com.tcs.service.error.customexception.DataNotFoundException
import com.tcs.service.model.BaseModel
import com.tcs.service.repository.BaseRepository
import org.springframework.stereotype.Service
import java.util.*


@Service
class BaseService(private val repository: BaseRepository) {

    fun getBaseModelById(id: String): BaseModel {
        return repository.findByModId(id)
    }

    fun getBaseModel(): MutableList<BaseModel> {

        return repository.findAll() ?: throw DataNotFoundException(ExceptionMessage.NO_DATA_FOUND)

    }

    fun saveModel(model: BaseModel) {
        repository.save(model)

    }

}