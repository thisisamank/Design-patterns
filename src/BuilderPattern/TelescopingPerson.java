package BuilderPattern;

public class TelescopingPerson {

    private String name;
    private String address;
    private String gender;

    public TelescopingPerson(String name){
        this.name = name;
    }
    public TelescopingPerson(String name,String address){
        this(name);
        this.address = address;
    }

    public TelescopingPerson(String name,String address,String gender){
        this(name, address);
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }
}
