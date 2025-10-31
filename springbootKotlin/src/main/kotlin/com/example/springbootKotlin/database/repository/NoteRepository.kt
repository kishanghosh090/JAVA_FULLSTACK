package com.example.springbootKotlin.database.repository

import com.example.springbootKotlin.database.model.Note
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository

interface NoteRepository: MongoRepository<Note, ObjectId> {
    fun findByOwnerId(ownerId: String): List<Note>

}
fun temp(repository: NoteRepository){

}