package sparkapi;

import spark.Request;
import spark.Response;

public class GetDemandsCreateRoute {

	
	
	//créer une demande
	
	public static String handle(Request request, Response response) {
		response.status(200);
		response.type("text/html; charset=utf-8");
		String doc = "";
		doc += " <html>";
		doc += " <body>";
		doc += " <p>============Crée une demande =================== <br /></p>";

		doc +="<form action=\"/demandes\" method=\"post\">";
		doc +="name:<br>";
		doc +="<input type=\"text\" name=\"description\" ><br>";
		doc +="<input type=\"text\" name=\"chargeutile\" ><br>";
		doc +="<input type=\"text\" name=\"choix1\" ><br>";
		doc +="<input type=\"text\" name=\"url1\" ><br>";
		doc +="<input type=\"text\" name=\"choix2\" ><br>";
		doc +="<input type=\"text\" name=\"url2\" ><br>";
		doc +="<input type=\"submit\" value=\"Submit\">";
		doc +="</form>";
		doc += " </body>";
		doc += " </html>";
		return doc;
	}

}
