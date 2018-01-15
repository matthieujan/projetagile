package sparkexample;

import static spark.SparkBase.setPort;

import java.io.ObjectOutputStream.PutField;
import java.util.HashMap;
public class Demandes {

	protected static HashMap<Integer, String > Demandes= new HashMap<>();

	public static String  getDemandesById(Integer id) {
		return Demandes.get(id);
	}
	public static void putDemandes(String demandes) {
		Demandes.put(Demandes.size(), demandes);
	}
}
