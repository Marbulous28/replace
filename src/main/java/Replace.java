import java.util.ArrayList;
import java.io.*;

public class Replace {

  public String replaceVowels( String puzzle ) {
    puzzle = puzzle.toLowerCase();
    String replacedString = puzzle.replace("a", "-");
    replacedString = replacedString.replace("e", "-");
    replacedString = replacedString.replace("i", "-");
    replacedString = replacedString.replace("o", "-");
    replacedString = replacedString.replace("u", "-");
    return replacedString;
  }

  public String checkAnswer( String potentialAnswer) {
    return "";
  }
}
