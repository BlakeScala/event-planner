import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;

public class EventTest{

  @Test
  public void getNumberOfPeople_returnsPrivate_Integer() {
    Event newParty = new Event(5,"pizza","sprite", true);
    assertEquals((Integer)5, newParty.getNumberOfPeople());
  }
}
