package com.example.springbootKotlin.controller

import com.example.springbootKotlin.database.model.Note
import com.example.springbootKotlin.database.repository.NoteRepository
import org.bson.types.ObjectId
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.time.Instant

@RestController
@RequestMapping("/notes")
class NoteController(
    private val repository: NoteRepository
) {
    data class NoteRequest(
        val _id: String?,
        val title: String,
        val content: String,
        val color: Long,
        val ownerId: String
    )

    data class  NoteResponse(
        val _id: String?,
        val title: String,
        val content: String,
        val color: Long,
        val createdAt: Instant
    )

    @PostMapping
    fun save(body: NoteRequest): NoteResponse{
        val note = repository.save(
            Note(
                _id = body._id?.let{ ObjectId(it)} ?: ObjectId.get(),
                title = body.title,
                color = body.color,
                content = body.content,
                createdAt = Instant.now(),
                ownerId = ObjectId(body.ownerId)
            )
        )

        return NoteResponse(
            _id = note._id.toHexString(),
            title = note.title,
            content =  note.content,
            color = note.color,
            createdAt = note.createdAt
        )
    }

    @GetMapping
    fun findByOwnerId(
        @RequestParam(required = true) ownerId: String
    ): List<NoteResponse>{
        return repository.findByOwnerId(ownerId).map {
            it.toResponse()
        }
    }
}

private fun Note.toResponse(): NoteController.NoteResponse{
    return NoteController.NoteResponse(
        _id = _id.toHexString(),
        title = title,
        content =  content,
        color = color,
        createdAt = createdAt
    )
}