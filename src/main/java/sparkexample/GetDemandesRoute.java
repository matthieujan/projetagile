package sparkexample;

import spark.Request;
import spark.Response;

//LISTER
public class GetDemandesRoute {
	
	public static String handle(Request request, Response response) {
		response.status(200);
    	response.type("text/html; charset=utf-8");
    	String demandes = "";
    	Demandes.putDemandes("Bonjour");
    	Demandes.putDemandes("Bonsoir");

//    	for(int i = 0; i<Demandes.Demandes.size();i++)
//    	{
//    		demandes = demandes + Demandes.getDemandesById(i) + " ";
//    	}
    	return demandes;
	}

}
