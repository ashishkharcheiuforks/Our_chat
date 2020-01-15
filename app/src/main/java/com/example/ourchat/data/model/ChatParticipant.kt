package com.example.ourchat.data.model


data class ChatParticipant(
    var particpant: User? = null,
    var lastMessage: String? = null,
    var lastMessageDate: Long? = null,
    var isLoggedUser: Boolean? = null,
    var imageUri: String? = null,
    var lastMessageType: Long? = null,
    var fileUri: String? = null,
    var fileName: String? = null


)