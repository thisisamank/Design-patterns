package BuilderPattern;

public class BuilderTest {

    public static void main(String[] args) {
        Person.Builder builder = new Person.Builder();
        Person person = builder.Name("Aman")
                               .Gender("Male")
                               .Address("Adampur")
                               .build();
        System.out.println(person.toString());
    }
}
