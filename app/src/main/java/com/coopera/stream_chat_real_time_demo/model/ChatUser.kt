package com.coopera.stream_chat_real_time_demo.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ChatUser(
    val firstName: String,
    val userName: String
) : Parcelable