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

	public static void main(String[] args) {
		putDemandes("coucou");
		putDemandes("coucou2");
		System.out.println(getDemandesById(0));
		System.out.println(getDemandesById(2));
	}
}
