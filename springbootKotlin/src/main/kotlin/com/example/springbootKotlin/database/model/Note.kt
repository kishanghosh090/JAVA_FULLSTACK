package com.example.springbootKotlin.database.model

import org.bson.types.ObjectId
import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant

@Document("notes")
data class Note(
    @Id val _id: ObjectId = ObjectId.get(),
    val content: String,
    val color: Long,
    val createdAt: Instant,
    val title: String,
    val ownerId: ObjectId
)
