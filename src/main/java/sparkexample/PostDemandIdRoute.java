package sparkexample;

import spark.Request;
import spark.Response;

public class PostDemandIdRoute {
	
	public static String handle(Request request, Response response) {
		response.status(501);
    	response.type("text/html; charset=utf-8");
    	return "\"demandes/id\" pas implémenté ";
	}


}
