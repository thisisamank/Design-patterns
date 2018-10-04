package PrototypePattern;

public class Main {

    public static void main(String[] args) {
        Registry registry = new Registry();
        Movie movie= (Movie) registry.createItem("Movie");

        movie.setTitle("First registry");
        System.out.println(movie);
        System.out.println("title "+movie.getTitle());
        System.out.println("price " + movie.getPrice());
        System.out.println("Url "+movie.getUrl());

        Movie anotherMovie=(Movie) registry.createItem("movie");
        anotherMovie.setTitle("Design patterns");
        System.out.println(anotherMovie);
        System.out.println("title "+anotherMovie.getTitle());
        System.out.println("price " + anotherMovie.getPrice());
        System.out.println("Url "+anotherMovie.getUrl());






    }
}
