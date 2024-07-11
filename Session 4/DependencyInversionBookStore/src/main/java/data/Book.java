package data;

public record Book(String isbn, String title, String author, double price) implements Item{
}
