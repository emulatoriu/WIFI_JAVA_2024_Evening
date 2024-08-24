package observer;

import observer.observable.NewsAgency;
import observer.observer.NewsChannel;
import observer.observer.PoliticsChannel;
import observer.observer.SportsChannel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency(new ArrayList<>());
        NewsChannel sports = new SportsChannel();
        NewsChannel politics = new PoliticsChannel();

        newsAgency.addObserver(sports);
        newsAgency.addObserver(politics);

        newsAgency.setNews("Good news");

        System.out.println(((SportsChannel)sports).getNews());
        System.out.println(((PoliticsChannel)politics).getNews());
    }
}
