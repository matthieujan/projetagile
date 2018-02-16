package sparkapi;

import static spark.SparkBase.setPort;

import java.io.ObjectOutputStream.PutField;
import java.util.ArrayList;
import java.util.HashMap;
public class DemandList {

	private static HashMap<Integer, Demand > Demandes= new HashMap<>();

	public static Demand  getDemandesById(Integer id) {
		return Demandes.get(id);
	}
	public static void putDemandes(Demand demande) {
		Demandes.put(Demandes.size(), demande);
	}
	
	public static void removeDemandesById(Integer id) {
		Demandes.remove(id);
	}
	public static Integer getDemandesSize() {
		return Demandes.size();
	}
	public static void editDemandes(Integer id ,Demand demande) {
		Demandes.put(id, demande);
	}
	public static ArrayList<Demand> getAllDemandes() {
		ArrayList<Demand> array = new ArrayList<>();
		
		for (int i = 0; i < getDemandesSize(); i++) {
			array.add(getDemandesById(i));
		}
		return array;
	}
	
}
