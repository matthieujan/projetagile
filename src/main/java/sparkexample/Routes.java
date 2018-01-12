package sparkexample;

import static spark.Spark.*;

public class Routes {


    public static void setRoutes() {

        get("/", (request, response) -> {
        	response.status(200);
        	response.type("text/html");
        	String documentation = "Doc : \n";
        	documentation += "/demandes: pas implémenté\n";
        	documentation += "/demandes/id: pas implémenté\n";
        	return documentation;
        });

        post("/demandes", (request, response) -> {
        	response.status(501);
        	response.type("text/html");
        	return "\"demandes/\" pas implémenté ";
        });

        put("/demandes/:id", (request, response) -> {
        	response.status(501);
        	response.type("text/html");
        	return "\"demandes/id\" pas implémenté ";
        });

        get("/demandes", (request, response) -> {
        	response.status(501);
        	response.type("text/html");
        	return "\"demandes/\" pas implémenté ";
        });

        get("/demandes/:id", (request, response) -> {
        	response.status(501);
        	response.type("text/html");
        	return "\"demandes/id\" pas implémenté ";
        });

        post("/demandes/:id", (request, response) -> {
        	response.status(501);
        	response.type("text/html");
        	return "\"demandes/id\" pas implémenté ";
        });
    }
}
