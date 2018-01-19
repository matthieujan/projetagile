package sparkexample;

import static spark.SparkBase.setPort;

import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;
import java.util.HashMap;
public class Demandes {

	private static HashMap<Integer, String > Demandes= new HashMap<>();

	public static String  getDemandesById(Integer id) {
		return Demandes.get(id);
	}
	public static void putDemandes(String demandes) {
		Demandes.put(Demandes.size(), demandes);
	}
	
	public static void removeDemandesById(Integer id) {
		Demandes.remove(id);
	}
	public static Integer getDemandesSize() {
		return Demandes.size();
	}
	public static void editDemandes(Integer id ,String demandes) {
		Demandes.put(id, demandes);
	}
	public static ArrayList<String> getAllDemandes() {
		ArrayList<String> array = new ArrayList<>();
		
		for (int i = 0; i < getDemandesSize(); i++) {
			array.add(getDemandesById(i));
		}
		return array;
	}
	
}
