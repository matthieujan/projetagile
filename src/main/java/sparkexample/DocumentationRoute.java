package sparkexample;

import spark.Request;
import spark.Response;

public class DocumentationRoute {


	public static String handle(Request request, Response response) {
		response.status(200);
    	response.type("text/html; charset=utf-8");

			String doc = "";
			doc += " <html>";
			doc += " <head>Documentation </head>";
		  doc += " <body>";
			doc += " <p>============API=================== <br /></p>";
			doc += " <p>Requete GET sur / pour renvoyer la documentation <br /></p>";
			doc += " <p>Requete GET sur /demandes/create pour accéder au formulaire<br /><p>";
			doc += " <p>Requete POST sur /demandes pour creer une demande<br /></p>";
			doc += " <p>Requete GET sur /demandes pour lister les demandes <br /></p>";
			doc += " <p>Requete GET sur /demande/{id_demande}   pour voir la demande <br /></p>";
			doc += " <p>Requete POST sur /demande/{id_demande}  voter la demande  <br /></p>";
			doc += " </body>";
			doc += " </html>";

			return doc;

	}

}
