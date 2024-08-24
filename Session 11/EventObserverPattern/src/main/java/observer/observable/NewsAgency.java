package observer.observable;

import observer.observer.NewsChannel;

import java.util.List;

public class NewsAgency {
    private String news;
    private final List<NewsChannel> channels;

    public NewsAgency(List<NewsChannel> channels) {
        this.channels = channels;
    }

    public void addObserver(NewsChannel channel) {
        this.channels.add(channel);
    }

    public void removeObserver(NewsChannel channel) {
        this.channels.remove(channel);
    }

    public void setNews(String news) {
        this.news = news;
        for (NewsChannel channel : this.channels) {
            channel.update(this.news);
        }
    }
}
