package SingletonPattern;

public class DbSingleton {

    // this is the instance which we are going to return
    private static volatile DbSingleton instance = null;

    //private constructor doesn't allow object creation from another class
    private DbSingleton (){}

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
