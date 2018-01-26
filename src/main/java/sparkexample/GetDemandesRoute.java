package sparkexample;

import java.util.ArrayList;

import spark.Request;
import spark.Response;

public class GetDemandesRoute {

	//LISTER
	public static String handle(Request request, Response response) {
		response.status(200);
		response.type("text/html; charset=utf-8");
		String doc = "";
		doc += " <html>";
		doc += " <body>";
		doc += " <p>============Liste Demandes=================== <br /></p>";

		ArrayList<Demande> AllDemandes = Demandes.getAllDemandes();
		if (AllDemandes.size()<=0) {
			doc += " <p>Il n'y a pas de demandes</p>";
		} else {
			doc += " <ul>";
			for (int i = 0; i < AllDemandes.size(); i++) {
				doc += " <li>";
				doc += "Demande : <a href=/demandes/"+i+">"+AllDemandes.get(i).description+"</a>";
				doc += " </li>";
			}
			doc += " </ul>";
		}
		doc += " </body>";
		doc += " </html>";


		return doc;
	}

}
