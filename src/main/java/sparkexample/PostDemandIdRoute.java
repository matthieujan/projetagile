package sparkexample;

import spark.Request;
import spark.Response;


//VOTER
public class PostDemandIdRoute {
	
	public static String handle(Request request, Response response) {
		response.status(200);
    	response.type("text/html; charset=utf-8");
    	
    	String demande = Demandes.getDemandesById(Integer.parseInt(request.params(":id")));
    	Demandes.removeDemandesById(Integer.parseInt(request.params(":id")));
    	if(request.body().equals("oui")) {
    		demande = "La requete "+demande+" est validé.";
    	}else {
    		demande = "La requete "+demande+" est refusé.";
    	}
    	return demande;
	}


}
