package pw.kasendev.retrokot.retrofit

import android.util.Log
import okhttp3.ResponseBody
import pw.kasendev.retrokot.model.responses.UserListResponse
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface UserAPI {

    @GET("users")
    abstract fun users(): Call<UserListResponse>

    companion object Factory {
        val BASE_URL = "http://192.168.100.10:8089/api/v1/"
        fun create(): UserAPI {
            val retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            return retrofit.create(UserAPI::class.java)
        }
    }

}