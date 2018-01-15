package sparkexample;

import spark.Request;
import spark.Response;


//CONSULTER
public class GetDemandIdRoute {
	
	public static String handle(Request request, Response response) {
		response.status(200);
    	response.type("text/html; charset=utf-8");
    	return Demandes.getDemandesById(Integer.parseInt(request.params(":id")));
	}

}