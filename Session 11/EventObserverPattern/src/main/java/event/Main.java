package event;

import event.observable.NewsAgency;
import event.observer.NewsChannel;

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();
        NewsChannel sportsChannel = new NewsChannel();
        NewsChannel crimeChannel = new NewsChannel();
        NewsChannel politicsChannel = new NewsChannel();

        newsAgency.addPropertyChangeListener(sportsChannel);
        newsAgency.addPropertyChangeListener(crimeChannel);
        newsAgency.addPropertyChangeListener(politicsChannel);

        newsAgency.setNews("Amazing news");
        System.out.println(sportsChannel.getNews());
        System.out.println(crimeChannel.getNews());
        System.out.println(politicsChannel.getNews());


    }
}
