package pw.kasendev.retrokot.model.generic

import com.google.gson.annotations.SerializedName

class Links {

    @SerializedName("first")
    var firstLink: String? = ""

    @SerializedName("last")
    var lastLink: String? = ""

    @SerializedName("prev")
    var prevLink: String? = ""

    @SerializedName("next")
    var nextLink: String? = ""

}