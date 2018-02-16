package sparkexample;

import java.util.HashMap;
import java.util.Map;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class TestTwigRoute {
	public static String handle(Request request, Response response) {

        Map<String, Object> map = new HashMap<String, Object>();
        String[] array = new String[3];
        array[0] = "Rafa";
        array[1] = "francois";
        array[2] = "toto";
        map.put("name", array);
        return new JtwigTemplateEngine().render(new ModelAndView(map, "test.twig"));
	}

}
