package BuilderPattern;

public class StringBuilderExample {

    public static void main(String []args){
        StringBuilder builder = new StringBuilder();
        builder.append("this is an example of StringBuilder,");
        builder.append("it can append anything with it. ");
        builder.append(87765);
        System.out.println(builder.toString());


    }



}
