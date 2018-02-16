package sparkexample;

import spark.Request;
import spark.Response;
import java.util.Map;


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

    	Demande demande = Demandes.getDemandesById(Integer.parseInt(request.params(":id")));

    	//On écrit la structure du HTML dans une chaine de caractère
    	String html = "";
    	html+= "<html>";
			html+= "<body>";
				html+= "<p><b>Demande :</b></p>";
				//On récupère la demande selon son ID.
				html+= Demandes.getDemandesById(Integer.parseInt(request.params(":id"))).description;

				if(demande.choix.size()!=0){
					for(Map.Entry<String, String> currentEntry : demande.choix.entrySet()){
					    html+= "<form action=\"/demandes/"+request.params(":id")+"\" method=\"post\">";
                        html+= "<input type=\"hidden\" name=\"choix\" value=\""+currentEntry.getKey()+"\">";
					    html+= "<input type=\"submit\" value=\""+currentEntry.getKey()+"\">";
                        html+="</form>";
					}
				}else{
					html+= "Pas de choix possible";
				}

			html+= "</body>";
		html+= "</html>";
    	return html;
	}

}