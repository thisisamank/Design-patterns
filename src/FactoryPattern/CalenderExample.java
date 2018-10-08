package FactoryPattern;

import java.util.Calendar;

public class CalenderExample {

    public static void main(String[] args) {

        Calendar calender = Calendar.getInstance();
        System.out.println(calender);
        System.out.println(calender.get(Calendar.DAY_OF_MONTH));
    }




}
