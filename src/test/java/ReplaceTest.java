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
  @Test
  public void replaceVowels_replaceAE_String() {
    Replace testReplace = new Replace();
    String expected = "h-y th-r- w-nd-r-r";
    assertEquals(expected, testReplace.replaceVowels("hey there wanderer"));
  }
  // @Test
  // public void replaceVowels_replaceA_String() {
  //   Replace testReplace = new Replace();
  //   String expected = "h-llo there";
  //   assertEquals(expected, testReplace.replaceVowels("hallo there"));
  // }
}
