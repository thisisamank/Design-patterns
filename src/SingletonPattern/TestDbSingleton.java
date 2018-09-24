package SingletonPattern;

public class TestDbSingleton {

    public static void main(String []args){
        DbSingleton instance1 = DbSingleton.getInstance();
        DbSingleton instance2 = DbSingleton.getInstance();

        if (instance1 == instance2){
            System.out.println("Both objects are same");
        }

    }

}
