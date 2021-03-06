package sparkapi;

import static spark.Spark.*;

import java.util.HashMap;
import java.util.Map;

import org.jtwig.JtwigTemplate;

import spark.ModelAndView;

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
        	return "Pas implémenté";
        });

        get("/demandes/create", (request, response) -> {
        	return GetDemandsCreateRoute.handle(request,response);
        });
        get("/demandes", (request, response) -> {
        	return GetDemandesRoute.handle(request, response);
        });

        get("/demandes/:id", (request, response) -> {
        	return GetDemandIdRoute.handle(request, response);
        });

        post("/demandes/:id", (request, response) -> {
        	return PostDemandIdRoute.handle(request, response);
        });


     }
}
