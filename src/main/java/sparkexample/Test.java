package sparkexample;

import static spark.Spark.*;

public class Test {

    public static void main(String[] args) {
        setPort(90);
        Routes.setRoutes();
    }
}
