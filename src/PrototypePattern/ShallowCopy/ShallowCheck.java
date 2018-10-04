package PrototypePattern.ShallowCopy;

import java.util.ArrayList;

public class ShallowCheck {

    public static void main(String[] args) {

        String sql="select * from names";
        ArrayList<String> list = new ArrayList<>();
        list.add("Aman");
        list.add("Aditya");
        Record record=new Record();
        Statement statement = new Statement(sql,list,record);
        System.out.println("statement is "+statement.getSql()+"\n"+
                            "parameters are "+statement.getParameters()+"\n"+
                            "Record is "+statement.getRecord());

        Statement statement1=statement.clone();
        System.out.println("------------------------------");
        System.out.println("statement is "+statement1.getSql()+"\n"+
                "parameters are "+statement1.getParameters()+"\n"+
                "Record is "+statement1.getRecord());


    }

}
