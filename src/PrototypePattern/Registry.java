package PrototypePattern;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String,Item> items=new HashMap<>();

    public Registry(){
        loadItems();
    }

    public Item createItem(String type){

        type=type.toLowerCase();//to be safe from unwanted bugs due to Uppercase letters
        Item item=null;
        try {
            item = (Item) (items.get(type).clone());
        }
        catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return item;
    }

    private void loadItems() {
        Movie movie=new Movie();
        movie.setRuntime("2 HOURS");
        movie.setPrice(250);
        movie.setTitle("basic movie");
        items.put("movie",movie);

        Book book=new Book();
        book.setPrice(242.32);
        book.setNumberOfPages(300);
        book.setTitle("Book!");
        items.put("book",book);


    }

}
