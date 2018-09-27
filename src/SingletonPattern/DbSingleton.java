package SingletonPattern;

import java.sql.Connection;
import java.sql.DriverManager;


public class DbSingleton {

    // this is the instance which we are going to return
    private static volatile DbSingleton instance = null;
    private static Connection connection = null;
    private final static String URL = "jdbc:sqlite:data.db";

    //private constructor doesn't allow object creation from another class
    private DbSingleton(){}

    //method to get the Connection to the database
    public Connection getConnection(){
        if (connection == null){
            synchronized (DbSingleton.class){
                if (connection == null){
                    try {
                        Class.forName("org.sqlite.JDBC");
                        connection = DriverManager.getConnection(URL);
                    }
                    catch (Exception e){
                        System.out.println(e.getMessage());
                    }
                }

            }

        }
        return connection;

    }

    // now this method will return the instance of this singleton class
    public static DbSingleton getInstance(){

        // this type of object creation makes it lazily-loaded and it can
        // provide a substantial improvement in the performance of our application

        if (instance==null){
            synchronized (DbSingleton.class){
                if (instance==null){
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }


}
