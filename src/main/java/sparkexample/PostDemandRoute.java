package sparkexample;

import spark.QueryParamsMap;
import spark.Request;
import spark.Response;

import java.util.HashMap;

public class PostDemandRoute {
	
	public static String handle(Request request, Response response) {
        String answer = "";
        if(!request.queryParams("name").isEmpty()){
			response.status(201);
			Demandes.putDemandes(request.queryParams("name"));
			String url = request.host()+"/demandes/"+Demandes.getDemandesSize();
			answer = "<a href=\""+url+"\">"+url+"</a>";
		}else{
			response.status(400);
			answer = "Mauvaise requete";

		}
    	response.type("text/html; charset=utf-8");
    	return answer;
	}

}
