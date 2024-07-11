package logic;

import data.Book;
import data.Item;
import repoistory.BookStore;

import java.util.Comparator;
import java.util.List;

public class BookStoreService {

    private final BookStore bookStore;

    public BookStoreService(BookStore bookStore) {
        this.bookStore = bookStore;
    }

    public Item getMostExpensive() {
//        List<Book> books = bookStore.getBooks();
//        if (books.isEmpty()) return null; // schlecht!!!!!!!!!!!!!!!
//        books.sort(Comparator.comparingDouble(Book::price).reversed());
//        return books.get(0);
        List<Item> items = bookStore.getItems();
        if (items.isEmpty()) return null; // schlecht!!!!!!!!!!!!!!!
        Item result = items.get(0);
        for (Item item : items) {
            if(item.price() > result.price()) {
                result = item;
            }
        }
        return result;
    }

    public Object getMostExpensiveItem(/*Liste von büchern und eine Liste von dvds*/) {
        /*
        * get most expensive book
        * get most expensive dvd
        *  compare moste expensive book with most expensive dvd
        * return bigger
        * */
    }
}
