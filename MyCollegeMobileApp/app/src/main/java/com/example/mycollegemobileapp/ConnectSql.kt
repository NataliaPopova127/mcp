package com.example.mycollegemobileapp

import android.os.StrictMode
import android.util.Log
import java.sql.Connection
import java.sql.DriverManager

class ConnectSql {
    private val ip = "32-8\\SQLEXPRESS"
    private val db = "MyCollegeDB"
    private val username = ""
    private val password = ""

    fun dbConn() : Connection?{
        val policy = StrictMode.ThreadPolicy.Builder().permitAll().build()
        StrictMode.setThreadPolicy(policy)
        var con : Connection? = null
        val connectionString : String
        try{
            Class.forName("net.sourceforge.jtds.jdbc.Driver").newInstance()
            //jdbc:jtds:sqlserver://$ip;databaseName=$db;user=$username;password=$password
            //Разрешить удаленное подключение (отказано в доступе) нужен ip серверной бд
            connectionString = "jdbc:jtds:sqlserver://localhost;database=MyCollegeDB;encrypt=true;integratedSecurity=true;"
            con = DriverManager.getConnection(connectionString)

//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
//            connectionString = "jdbc:sqlserver://localhost;encrypt=true;database=$db;integratedSecurity=true;"
//            con = DriverManager.getConnection(connectionString);

//            val ds = SQLServerDataSource()
//            ds.setUser("MyUserName")
//            ds.setPassword("*****")
//            ds.setServerName("localhost")
//            ds.setPortNumber(1433)
//            ds.setDatabaseName("AdventureWorks")
//            val con: Connection = ds.getConnection()
        }
        catch (e:Exception){
            Log.e("GGGGGGGGGGG: ", e.message!!)
        }
        return con
    }
}