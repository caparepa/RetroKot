package pw.kasendev.retrokot

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import okhttp3.ResponseBody
import pw.kasendev.retrokot.model.User
import pw.kasendev.retrokot.model.responses.UserListResponse
import pw.kasendev.retrokot.retrofit.UserAPI
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val theButton: Button = okButton

        //original click listener
        /*theButton.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                getUsers()
            }
        })*/

        //lambda click listener
        theButton.setOnClickListener { getUsers() }
    }

    private fun getUsers() {

        val userListService = UserAPI.create()

        val call = userListService.users()

        call.enqueue(object : Callback<UserListResponse> {
            override fun onFailure(call: Call<UserListResponse>?, t: Throwable?) {
                Log.d("SIMPLEKOT", t.toString())
                //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: Call<UserListResponse>?, response: Response<UserListResponse>?) {
                Log.d("SIMPLEKOT", response.toString())
                var userList: ArrayList<User> = response?.body()?.dataResponse!!
                for (user: User in userList.iterator()) {
                    Log.d("SIMPLEKOT_USER", user.email)
                }
                //TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })


    }
}
