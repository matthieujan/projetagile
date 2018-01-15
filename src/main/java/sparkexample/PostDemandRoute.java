package sparkexample;

import spark.Request;
import spark.Response;

public class PostDemandRoute {
	
	public static String handle(Request request, Response response) {
		response.status(501);
		String content = request.body();
		Demandes.putDemandes(content);
    	response.type("text/html; charset=utf-8");
    	System.out.println(content);
    	return "la demande a bien été envoyée";
	}

}
