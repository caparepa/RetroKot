package pw.kasendev.retrokot.model

import com.google.gson.annotations.SerializedName

class Profile {

    @SerializedName("id")
    var id: Int = 0

    @SerializedName("full_name")
    var fullName: String = ""

    @SerializedName("birthdate")
    var birthdate: String = ""

    @SerializedName("user_id")
    var userId: Int = 0

}