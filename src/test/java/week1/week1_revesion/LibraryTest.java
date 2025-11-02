package week1.week1_revesion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.print.Book;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    Library lib ;

    @BeforeEach
    void setUp() {
        lib = new Library();
    }

    @Test
    void addBookShouldIncreaseCount() {
        lib.addBook("genre lion");
        assertEquals(1,lib.getBookCount());
    }

    @Test
    void hasBookShouldReturnWhenBookExists() {
        lib.addBook("What's your dream?");
        assertTrue(lib.hasBook("What's your dream?"));
    }

    @Test
    void getBookCount() {
        lib.addBook("What's your dream?");
        assertEquals(1,lib.getBookCount());
    }

    @Test
    void getBookCountAddTwoBooks() {
        lib.addBook("What's your dream?");
        lib.addBook("The ballad of never after");
        assertEquals(2,lib.getBookCount());
    }

    @Test
    void getBookCountAddFourBooks() {
        lib.addBook("What's your dream?");
        lib.addBook("The ballad of never after");
        lib.addBook("Desing your own life ");
        lib.addBook("les miserables");
        assertEquals(4,lib.getBookCount());
    }

}