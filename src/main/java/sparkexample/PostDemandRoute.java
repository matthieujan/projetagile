package sparkexample;

import spark.QueryParamsMap;
import spark.Request;
import spark.Response;

import java.util.HashMap;

public class PostDemandRoute {

	public static String handle(Request request, Response response) {
        String answer = "";
        boolean demandeOk = true;
        demandeOk = demandeOk && !request.queryParams("description").isEmpty();
        String description = request.queryParams("description");
        demandeOk = demandeOk && !request.queryParams("chargeutile").isEmpty();
        String chargeutile = request.queryParams("chargeutile");
        //TODO Dynamic handling
        HashMap<String,String> choix = new HashMap();
        demandeOk = demandeOk && !request.queryParams("choix1").isEmpty();
        demandeOk = demandeOk && !request.queryParams("url1").isEmpty();
        if(demandeOk)choix.put(request.queryParams("choix1"),request.queryParams("url1"));
        demandeOk = demandeOk && !request.queryParams("choix2").isEmpty();
        demandeOk = demandeOk && !request.queryParams("url2").isEmpty();
        if(demandeOk)choix.put(request.queryParams("choix2"),request.queryParams("url2"));
        if(demandeOk){
			response.status(201);
            Demande d = new Demande(description,chargeutile,choix);
			String url = request.host()+"/demandes/"+Demandes.getDemandesSize();
			Demandes.putDemandes(d);

			answer = "<html><body><a href=\""+url+"\">"+url+"</a></body></html>";
		}else{
			response.status(400);
			answer = "Mauvaise requete";

		}
    	response.type("text/html; charset=utf-8");
    	return answer;
	}

}
