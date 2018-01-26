package sparkexample;

import spark.Request;
import spark.Response;

import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


//VOTER
public class PostDemandIdRoute {
	
	public static String handle(Request request, Response response) {
		response.status(200);
    	response.type("text/html; charset=utf-8");
    	
//    	String demande = Demandes.getDemandesById(Integer.parseInt(request.params(":id")));
//    	Demandes.removeDemandesById(Integer.parseInt(request.params(":id")));
//    	if(request.body().equals("oui")) {
//    		demande = "La requete "+demande+" est validé.";
//    	}else {
//    		demande = "La requete "+demande+" est refusé.";
//    	}

        Integer id = Integer.parseInt(request.params(":id"));
        String choix = request.queryParams("choix");
        String url = Demandes.getDemandesById(id).choix.get(choix);
        String answer = "Erreur traitement.";
        String chargeutil = Demandes.getDemandesById(id).chargeutile;

        try {
            URL u = new URL(url);
            HttpURLConnection con = (HttpURLConnection) u.openConnection();
            con.setRequestMethod("POST");
            con.setDoOutput(true);
            OutputStream os = con.getOutputStream();

            os.write(chargeutil.getBytes());

            os.flush();
            os.close();

            int responseCode = con.getResponseCode();
            answer = "Envoyé à l'URL : "+ url;
            answer+= " codeHttp = "+responseCode;


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return answer;
	}


}
