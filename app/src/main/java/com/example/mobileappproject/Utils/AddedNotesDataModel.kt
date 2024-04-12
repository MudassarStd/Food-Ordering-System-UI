package com.example.mobileappproject.Utils

class AddedNotesDataModel {
    companion object{
        val notesList : MutableList<String> = mutableListOf()

        fun addNotes(note : String)
        {
            notesList.add(note)
        }

        fun delNote(notePosition : Int)
        {
            notesList.removeAt(notePosition)
        }
    }
}