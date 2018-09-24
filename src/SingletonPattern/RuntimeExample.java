package SingletonPattern;

public class RuntimeExample {

    public static void main(String []args){
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime);
        Runtime runtime2 = Runtime.getRuntime();
        System.out.println(runtime2);
        if (runtime == runtime2){
            System.out.println("Both objects are same, meaning " +
                                    "this is a singleton pattern");
        }


    }




}
