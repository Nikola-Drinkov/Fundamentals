package AdvertisementMessage;

import java.util.Arrays;
import java.util.Random;

public class Advertisement {
    private String [] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
    private String [] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
    private String [] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
    private String [] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

    Random rnd = new Random();
    public String getPhrase() {
        int rndIndex = rnd.nextInt(phrases.length);
        return phrases[rndIndex];
    }

    public String getEvent() {
        int rndIndex = rnd.nextInt(events.length);
        return events[rndIndex];
    }

    public String getAuthor() {
        int rndIndex = rnd.nextInt(authors.length);
        return authors[rndIndex];
    }

    public String getCity() {
        int rndIndex = rnd.nextInt(cities.length);
        return cities[rndIndex];
    }

    @Override
    public String toString() {
       return String.format("%s %s %s - %s",getPhrase(),getEvent(),getAuthor(),getCity());
    }
}
