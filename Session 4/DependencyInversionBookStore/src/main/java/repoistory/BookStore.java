package repoistory;

import data.Item;

import java.util.List;

public class BookStore { // HigherLevel module
    private final List<Item> items; // abstraction of lower level modules

    public BookStore(List<Item> items) {
        this.items = items;
    }
    public List<Item> getItems() {
        return items;
    }

    // add
    //remove
}
