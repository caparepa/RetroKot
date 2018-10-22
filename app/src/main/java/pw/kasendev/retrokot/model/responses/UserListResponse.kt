package pw.kasendev.retrokot.model.responses

import com.google.gson.annotations.SerializedName
import pw.kasendev.retrokot.model.User
import pw.kasendev.retrokot.model.generic.Links
import pw.kasendev.retrokot.model.generic.Meta
import java.util.ArrayList

class UserListResponse {

    @SerializedName("data")
    var dataResponse: ArrayList<User>? = null

    @SerializedName("links")
    var links: Links? = null

    @SerializedName("meta")
    var metaResponse: Meta? = null

    @SerializedName("status")
    var status: String = ""

    @SerializedName("code")
    var code: Int = 0

}