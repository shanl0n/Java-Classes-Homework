import com.codeclan.Book;
import com.codeclan.Library;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

  private Book book1;
  private Book book2;
  private Library library;

  @Before
  public void setUp() {
    book1 = new Book("Nineteen Eighty-Four", "George Orwell", "Dystopian Fiction");
    book2 = new Book("The Borrowers", "Mary Norton", "Children's Novel");
    library = new Library(2);
  }

  @Test
  public void canReportCapacity() {
    assertEquals(true, library.hasCapacity());
  }

  @Test
  public void canAddBookWithRoom() {
    library.addBook(book1);
    library.addBook(book1);
    assertEquals(2, library.bookCount());
  }

  @Test
  public void cannotAddBookWithNoRoom() {
    library.addBook(book1);
    library.addBook(book2);
    assertEquals(2, library.bookCount());
  }
}
