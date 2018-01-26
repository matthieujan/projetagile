package sparkexample;

import static spark.SparkBase.setPort;

import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;
import java.util.HashMap;
public class Demandes {

	private static HashMap<Integer, Demande > Demandes= new HashMap<>();

	public static Demande  getDemandesById(Integer id) {
		return Demandes.get(id);
	}
	public static void putDemandes(Demande demande) {
		Demandes.put(Demandes.size(), demande);
	}
	
	public static void removeDemandesById(Integer id) {
		Demandes.remove(id);
	}
	public static Integer getDemandesSize() {
		return Demandes.size();
	}
	public static void editDemandes(Integer id ,Demande demande) {
		Demandes.put(id, demande);
	}
	public static ArrayList<Demande> getAllDemandes() {
		ArrayList<Demande> array = new ArrayList<>();
		
		for (int i = 0; i < getDemandesSize(); i++) {
			array.add(getDemandesById(i));
		}
		return array;
	}
	
}
