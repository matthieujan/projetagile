package sparkexample;

import spark.Request;
import spark.Response;

public class PostDemandRoute {
	
	public static String handle(Request request, Response response) {
		response.status(501);
    	response.type("text/html; charset=utf-8");
    	return "\"demandes/\" pas implémenté ";
	}

}
