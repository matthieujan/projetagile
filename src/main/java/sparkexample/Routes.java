package sparkexample;

import static spark.Spark.*;

public class Routes {
	

    public static void setRoutes() {
    	
        get("/", (request, response) -> {
        	response.status(200);          
        	response.type("text/xml");
        	String documentation = "Doc : \n";
        	documentation += "/demandes: pas impl�ment�\n";
        	documentation += "/demandes/id: pas impl�ment�\n";
        	return documentation;
        });
        
        post("/demandes", (request, response) -> {
        	response.status(501);          
        	response.type("text/xml");  
        	return "\"demandes/\" pas impl�ment� ";
        });
        
        put("/demandes/:id", (request, response) -> {
        	response.status(501);          
        	response.type("text/xml");  
        	return "\"demandes/id\" pas impl�ment� ";
        });
        
        get("/demandes", (request, response) -> {
        	response.status(501);          
        	response.type("text/xml");  
        	return "\"demandes/\" pas impl�ment� ";
        });
        
        get("/demandes/:id", (request, response) -> {
        	response.status(501);          
        	response.type("text/xml");  
        	return "\"demandes/id\" pas impl�ment� ";
        });
        
        post("/demandes/:id", (request, response) -> {
        	response.status(501);          
        	response.type("text/xml");  
        	return "\"demandes/id\" pas impl�ment� ";
        });
    }
}
