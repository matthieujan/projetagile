package sparkexample;

import spark.QueryParamsMap;
import spark.Request;
import spark.Response;

import java.util.HashMap;

public class PostDemandRoute {
	
	public static String handle(Request request, Response response) {
        String answer = "";
//        System.out.println(request.queryParams("name"));
//        if(!request.queryParams("name").isEmpty()){
//			response.status(201);
//			Demandes.putDemandes(request.queryParams("name"));
//			String url = request.host()+"/demandes/"+Demandes.getDemandesSize();
//
//			answer = "<html><body><a href=\""+url+"\">"+url+"</a></body></html>";
//		}else{
//			response.status(400);
//			answer = "Mauvaise requete";
//
//		}
//    	response.type("text/html; charset=utf-8");
    	return "todo";
	}

}
