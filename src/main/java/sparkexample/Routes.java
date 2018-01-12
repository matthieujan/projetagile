package sparkexample;

import static spark.Spark.*;

public class Routes {


    public static void setRoutes() {

        get("/", (request, response) -> {
        	return DocumentationRoute.handle(request, response);
        });

        post("/demandes", (request, response) -> {
        	return PostDemandRoute.handle(request, response);
        });

        put("/demandes/:id", (request, response) -> {
        	response.status(501);
        	response.type("text/html; charset=utf-8");
        	return "\"demandes/id\" pas implémenté ";
        });

        get("/demandes", (request, response) -> {
        	return GetDemandesRoute.handle(request, response);
        });

        get("/demandes/:id", (request, response) -> {
        	response.status(501);
        	response.type("text/html; charset=utf-8");
        	return "\"demandes/id\" pas implémenté ";
        });

        post("/demandes/:id", (request, response) -> {
        	
        	return PostDemandIdRoute.handle(request, response);
        });
    }
}
