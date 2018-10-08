package Kotlin_implementation

import java.sql.Connection
import java.sql.DriverManager


class Singleton private constructor() {


    private val URL = "jdbc:sqlite:data.db"
    private var connection : Connection? = null


    companion object {

        private var instance:Singleton?=null
        fun getInstance():Singleton?{

            if (instance==null){
                synchronized(Singleton::class){
                    if (instance == null) {
                        instance = Singleton();
                    } }

            }
            return instance;
        }

    }





    fun getConnection():Connection? {
        if (connection==null){
            synchronized(Singleton::class){
                Class.forName("org.sqlite.JDBC")
                connection=DriverManager.getConnection(URL)
            }
        }
        return connection;
    }

}