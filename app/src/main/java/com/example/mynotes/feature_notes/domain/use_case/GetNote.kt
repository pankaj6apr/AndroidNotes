package com.example.mynotes.feature_notes.domain.use_case

import com.example.mynotes.feature_notes.domain.model.Note
import com.example.mynotes.feature_notes.domain.repository.NoteRepository

class GetNote(
    private val respository: NoteRepository
) {
    suspend operator fun invoke(id: Int): Note? {
        return respository.getNoteById((id))
    }
}