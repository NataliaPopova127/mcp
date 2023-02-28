package com.example.mycollegemobileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_authorization.*
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.sql.PreparedStatement

class AuthorizationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_MyCollegeMobileApp)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authorization)
        title = "Авторизация"
    }

    fun btnApplicantInfClick(view: View) {
        var intent : Intent = Intent(this@AuthorizationActivity, ApplicantInfActivity::class.java)
        startActivity(intent)
    }
    fun btnSignInClick(view: View) {
        var intent : Intent = Intent(this@AuthorizationActivity, MainMenuActivity::class.java);
        //addUser()
        startActivity(intent);
        //getLoginAndPassword()
    }
//    fun getLoginAndPassword() : Thread{
//        return Thread{
//            val url = URL("") //ДОБАВИТЬ URL
//            val connection = url.openConnection() as HttpURLConnection
//
//            if(connection.responseCode == 200){
//                val inputSystem = connection.inputStream
//                val inputStreamReader = InputStreamReader(inputSystem, "UTF-8")
//                val request = Gson().fromJson(inputStreamReader, Request::class.java)
//                updateUI(request)
//                inputStreamReader.close()
//                inputSystem.close()
//            }
//            else{
//                Toast.makeText(this, "Failed Connection", Toast.LENGTH_SHORT).show()
//            }
//        }
//    }

//    private fun updateUI(request: Request) {
//        runOnUiThread {
//            kotlin.run{
//                //проверка логина пароля и парсинг
//                tbLogin.text = request.login
//                tbPassword.text = request.password
//            }
//        }
//
//    }

    private var connectSql = ConnectSql()
    private fun addUser(){
        try{
            val user : PreparedStatement = connectSql.dbConn()?.prepareStatement("insert into User2(name, surname) values (${tbLogin.text},${tbPassword.text})")!!
            Toast.makeText(this, "3", Toast.LENGTH_SHORT).show()
            user.executeUpdate()
            Toast.makeText(this, "Add user", Toast.LENGTH_SHORT).show()
        }
        catch (e : Exception){
            Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()
        }
    }
}