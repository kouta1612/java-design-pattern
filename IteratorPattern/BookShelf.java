package IteratorPattern;

import java.util.ArrayList;

public class BookShelf implements Aggregate {
    private ArrayList<Book> books;
    private int last = 0;

    public BookShelf() {
        this.books = new ArrayList<Book>();
    }

    public Book getBook(int index) {
        return this.books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
        this.last++;
    }

    public int getLength() {
        return this.last;
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}