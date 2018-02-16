package sparkapi;

import static spark.Spark.*;

public class Main {

    public static void main(String[] args) {
        setPort(80);
        Routes.setRoutes();
    }
}

