import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class ReplaceTest {

  @Test
  public void replaceVowels_replaceA_String() {
    Replace testReplace = new Replace();
    String expected = "c-r";
    assertEquals(expected, testReplace.replaceVowels("car"));
  }
}
