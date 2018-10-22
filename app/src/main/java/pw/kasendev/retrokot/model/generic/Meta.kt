package pw.kasendev.retrokot.model.generic

import com.google.gson.annotations.SerializedName

class Meta {

    @SerializedName("current_page")
    var currentPage: Int = 0

    @SerializedName("from")
    var fromPage: Int? = 0

    @SerializedName("last_page")
    var lastPage: Int? = 0

    @SerializedName("path")
    var pathUrl: String = ""

    @SerializedName("per_page")
    var perPage: Int? = 0

    @SerializedName("to")
    var toPage: Int? = 0

    @SerializedName("total")
    var totalPage: Int? = 0

}