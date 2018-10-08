package FactoryPattern;

public class Shop extends Website {


    @Override
    protected void createWebsite() {
        pages.add(new AboutPage());
        pages.add(new CartPage());
        pages.add(new ContactPage());
        pages.add(new SearchPage());

    }
}
