package pw.kasendev.retrokot.model

import com.google.gson.annotations.SerializedName

class User {

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("username")
    var username: String = ""

    @SerializedName("email")
    var email: String = ""

    @SerializedName("status")
    var status: String? = ""

    @SerializedName("last_login")
    var lastLogin: String? = ""

    @SerializedName("profile")
    var progile: Profile = Profile()

}