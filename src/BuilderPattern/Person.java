package BuilderPattern;

public class Person {

    private String name;
    private String address;
    private String gender;


    public static class Builder{

        private String name;
        private String address;
        private String gender;

        public Person build(){
            return new Person(this);
        }
        public Builder Name(String name){
            this.name = name;
            return this;
        }

        public Builder Address(String address){
            this.address =address;
            return this;
        }

        public Builder Gender(String gender){
            this.gender = gender;
            return this;
        }

    }


    public Person(Builder builder) {
        this.address = builder.address;
        this.gender = builder.gender;
        this.name = builder.name;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
