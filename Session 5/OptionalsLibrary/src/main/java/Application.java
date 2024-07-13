import data.Book;
import logic.BookService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Book book1 = new Book("sfdgvvdfsg", "Kleine Weltgeschichte", "Hans Joachim Störig");
        Book book2 = new Book("hgfhfggf", "Mathematik ...", "Barbara Oakley");
        Book book3 = new Book("dfsdfd", "Flüchtig", "Hubert von Goisern");
        books.add(book1);
        books.add(book2);
        books.add(book3);
        BookService bookService = new BookService();
//        Book found = bookService.getBookWithTitle(books, "Harry Potter und die sieben Zwerge");
//        System.out.println(found.author());
        Optional<Book> optionalBook = bookService.getBookWithTitle(books, "Harry Potter und die sieben Zwerge");
        if(optionalBook.isPresent()){
            System.out.println(optionalBook.get().author());
        } else {
            System.out.println("Not found");
        }
    }
}
