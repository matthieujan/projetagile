package sparkexample;

import spark.Request;
import spark.Response;

public class DocumentationRoute {


	public static String handle(Request request, Response response) {
		response.status(200);
    	response.type("text/html; charset=utf-8");
    	String documentation = "Doc : \n";
    	documentation += "/demandes: pas implémenté\n";
    	documentation += "/demandes/id: pas implémenté\n";
    	return documentation;
	}

}
