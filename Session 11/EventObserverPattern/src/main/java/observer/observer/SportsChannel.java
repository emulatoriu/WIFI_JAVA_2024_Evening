package observer.observer;

public class SportsChannel implements NewsChannel{
    private String news;
    @Override
    public void update(String news) {
        setNews(news);
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }
}
