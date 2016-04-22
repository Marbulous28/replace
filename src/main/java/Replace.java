import java.util.ArrayList;
import java.io.*;

public class Replace {

  public String replaceVowels( String puzzle ) {

    String replacedVowelString = puzzle.replace("a", "-");
    replacedVowelString = replacedVowelString.replace("e", "-");
    replacedVowelString = replacedVowelString.replace("i", "-");
    replacedVowelString = replacedVowelString.replace("o", "-");
    replacedVowelString = replacedVowelString.replace("u", "-");
      return replacedVowelString;
  }
}
