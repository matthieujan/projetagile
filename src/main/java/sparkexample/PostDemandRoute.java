package sparkexample;

import spark.Request;
import spark.Response;

import java.util.HashMap;

public class PostDemandRoute {
	
	public static String handle(Request request, Response response) {
		String content = request.body();
		String[] params = content.split("&");
        HashMap<String,String> paramsMap = new HashMap();

        String key = "";
        String value = "";
        for(String sentences:params){
            key=sentences.split("=")[0];
			value=sentences.split("=")[1];

            paramsMap.put(key,value);
        }


        String answer = "";
        if(paramsMap.containsKey("name")){
			response.status(201);
			Demandes.putDemandes(paramsMap.get("name"));
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
