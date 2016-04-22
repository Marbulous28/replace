import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {

  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/display", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/display.vtl");

      String inputtedPuzzle = request.queryParams("puzzleSentence");

      Replace myReplace = new Replace();
      String output = myReplace.replaceVowels(inputtedPuzzle);

      model.put("output", output);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/answer", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/answer.vtl");

      String solution = request.queryParams("puzzleAnswer");
      Replace check = new Replace();

      String myAnswer = check.checkAnswer(solution, inputtedPuzzle);

      model.put("myAnswer", myAnswer);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
