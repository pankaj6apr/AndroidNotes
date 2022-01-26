package com.example.mynotes.feature_notes.presentation.add_edit_note

import androidx.compose.ui.focus.FocusState

sealed class AddEditNoteEvent {
    data class EneteredTitle (val value: String): AddEditNoteEvent()
    data class ChangeTitleFocus (val focusState: FocusState): AddEditNoteEvent()
    data class EneteredContent (val value: String): AddEditNoteEvent()
    data class ChangeCotentFocus (val focusState: FocusState): AddEditNoteEvent()
    data class ChangeColor(val color: Int): AddEditNoteEvent()
    object SaveNote: AddEditNoteEvent()
}
