package sparkexample;

import spark.Request;
import spark.Response;

public class GetDemandesRoute {
	
	public static String handle(Request request, Response response) {
		response.status(200);
    	response.type("text/html; charset=utf-8");
    	return Demandes.getAllDemandes().toString();
	}

}
