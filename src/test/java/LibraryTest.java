import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library("Edinburgh", 20);
        book = new Book("a","b","c");
    }

    @Test
    public void canCountBooks(){
        library.addBookIfUnderCapacity(book);
        assertEquals(1,library.countBooks());

    }

    @Test
    public void canAddBookFalse(){
        Library testLibrary = new Library("Glasgow",2);
        testLibrary.addBookIfUnderCapacity(book);
        testLibrary.addBookIfUnderCapacity(book);
        testLibrary.addBookIfUnderCapacity(book);
        assertEquals(false,testLibrary.underCapacity());
    }
    @Test
    public void canAddBookTrue(){
        Library testLibrary = new Library("Aberdeen",4);
        testLibrary.addBookIfUnderCapacity(book);
        testLibrary.addBookIfUnderCapacity(book);
        testLibrary.addBookIfUnderCapacity(book);
        assertEquals(true,testLibrary.underCapacity());
    }




}
