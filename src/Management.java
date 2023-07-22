import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Management {
    private Map<Integer, Book> books;
    private List<Integer> availableBooks;
    private List<Integer> lendingBooks;

    public Management(){
        this.books= new HashMap<>();
        this.availableBooks=new ArrayList<>();
        this.lendingBooks=new ArrayList<>();
    }

    public void addBook(Book book) {
        books.put(book.getISBN(), book);
        availableBooks.add(book.getISBN());
    }

    public void removeBook(Book book) {
        books.remove(book.getISBN());
        availableBooks.remove(book.getISBN());
    }

    public void lendingBook(Book book) {
        availableBooks.remove(book.getISBN());
        lendingBooks.add(book.getISBN());
    }
    public void returnBook(Book book) {
        availableBooks.add(book.getISBN());
        lendingBooks.remove(book.getISBN());
    }

    public void updateBook(int ISBN){
    }

    public void viewAvailableBook() {
        System.out.println(availableBooks);
    }

}
