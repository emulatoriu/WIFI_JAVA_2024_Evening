package logic;

import data.Book;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class BookService {
//    public Book getBookWithTitle(List<Book> books, String title) {
//        for (Book book : books) {
//            if(book.title().equalsIgnoreCase(title)) {
//                return book;
//            }
//        }
//        return null;
//    }
    public Optional<Book> getBookWithTitle(List<Book> books, String title) {
//        for (Book book : books) {
//            if(book.title().equalsIgnoreCase(title)) {
//                return Optional.of(book);
//            }
//        }
//        return Optional.empty();
        return books.stream()
                .filter(book -> book.title().equalsIgnoreCase(title))
                .findFirst();
    }
}
