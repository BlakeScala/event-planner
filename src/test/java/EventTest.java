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

  @Test
  public void getFoodServed_returnsPrivate_String() {
    Event newParty = new Event(5,"pizza","sprite", true);
    assertEquals("pizza", newParty.getFoodServed());
  }

  @Test
  public void getBeveragesServed_returnsPrivate_String() {
    Event newParty = new Event(5,"pizza","sprite", true);
    assertEquals("sprite", newParty.getBeveragesServed());
  }

  @Test
  public void getBeveragesServed_returnsPrivate_boolean() {
    Event newParty = new Event(5,"pizza","sprite", true);
    assertEquals(true, newParty.getHireBand());
  }
}
