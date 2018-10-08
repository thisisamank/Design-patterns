package SingletonPattern;

import Kotlin_implementation.Singleton;

import java.sql.Connection;

public class TestDbSingleton {

    public static void main(String []args){
        DbSingleton instance1 = DbSingleton.getInstance();
        Connection connection = instance1.getConnection();
        System.out.println(connection);

        Singleton singleton=Singleton.Companion.getInstance();
        System.out.println(singleton);

        Singleton singleton1=Singleton.Companion.getInstance();
        System.out.println(singleton1);


    }

}
