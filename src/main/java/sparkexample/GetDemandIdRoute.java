package sparkexample;

import spark.Request;
import spark.Response;


/**
 * 
 * @author Felix
 * Cette classe répertorie toute les méthodes relatives à la route /demande/id
 * lors d'un GET.
 */
public class GetDemandIdRoute {
	/**
	 * actions à effectuer lorsque le get est appelé sur /demande/id
	 * @param request La requête interceptée
	 * @param response la réponse renvoyée
	 * @return la page HTML
	 */
	public static String handle(Request request, Response response) {
		response.status(200);
		//On renvoie ici du HTML
    	response.type("text/html; charset=utf-8");
    	//On écrit la structure du HTML dans une chaine de caractère
    	String html = "";
    	html+= "<html>";
			html+= "<body";
				html+= "<p><b>Demande :</b></p>";
				//On récupère la demande selon son ID.
				html+= Demandes.getDemandesById(Integer.parseInt(request.params(":id"))).description;
			html+= "</body>";
		html+= "</html>";
    	return html;
	}

}