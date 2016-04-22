import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void testIndex() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Vowel Puzzle");
  }

  @Test
  public void checkPuzzle() {
    goTo("http://localhost:4567/");
    fill("#puzzleSentence").with("i say hello to you.");
    submit(".btn");
    assertThat(pageSource()).contains("- s-y h-ll- t- y--.");
}
}
