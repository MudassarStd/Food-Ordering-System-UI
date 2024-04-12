package com.example.mobileappproject.Utils

class ChatDataModel {

    // companion object eliminates the need for class instantiation
    companion object
    {
        val msgList : MutableList<String> = mutableListOf()
        val recList : MutableList<String> = mutableListOf()
        fun putDataIntoLists(msg : String, name : String)
        {
            msgList.add(msg)
            recList.add(name)
        }

        fun removeDataFromLists()
        {
            msgList.removeAt(msgList.size-1)
            recList.removeAt(recList.size-1)
        }
    }
}