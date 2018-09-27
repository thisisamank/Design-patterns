package SingletonPattern;

import java.sql.Connection;

public class TestDbSingleton {

    public static void main(String []args){
        DbSingleton instance1 = DbSingleton.getInstance();
        Connection connection = instance1.getConnection();
        System.out.println(connection);

    }

}
