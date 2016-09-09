import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class EventTest{

  @Test
  public void getNumberOfPeople_returnsPrivate_Integer() {
    Event newParty = new Event(5,"3","2", "4");
    assertEquals((Integer)5, newParty.getNumberOfPeople());
  }

  @Test
  public void getfoodChoice_returnsPrivate_Array() {
    Event newParty = new Event(5,"1","2", "4");
    assertEquals("1", newParty.getfoodChoice());
  }

  @Test
  public void getBeverageChoice_returnsPrivate_String() {
    Event newParty = new Event(5,"3","2", "4");
    assertEquals("2", newParty.getBeverageChoice());
  }

  @Test
  public void getEntertainmentChoice_returnsPrivate_boolean() {
    Event newParty = new Event(5,"3","2", "4");
    assertEquals("4", newParty.getEntertainmentChoice());
  }

  // @Test
  // public void numberOfPeopleCost_getCostForPeople_Integer() {
  //   Event newParty = new Event(5,"3","2", "4");
  //   assertEquals((Integer)10, newParty.numberOfPeopleCost());
  // }
  //
  // @Test
  // public void foodChoiceCost_getCostForOneFood_Integer() {
  //   Event newParty = new Event(5,"chips","2", "4");
  //   assertEquals((Integer)3, newParty.foodChoiceCost());
  // }

}
