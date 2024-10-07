package com.oym.libraryapi.data.remote.model

import com.google.gson.annotations.SerializedName

data class BookDetailDTO(


    @SerializedName("title")
    var title: String? = null,

    @SerializedName("author")
    var author: String? = null,

    @SerializedName("year")
    var year: Int? = 0,

    @SerializedName("genre")
    var genre: String? = null,

    @SerializedName("isbn")
    var isbn: String? = null,

    @SerializedName("imageUrl")
    var image: String? = null,

    @SerializedName("description")
    var description: String? = null
)