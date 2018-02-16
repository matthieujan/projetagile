package sparkapi;

import java.util.HashMap;

public class Demand {
	
	public String description;
	
	public String chargeutile ;
	
	public HashMap<String, String> choix ;
	
	public Demand(String d,String c,HashMap<String, String> ch) {
		
		this.description=d;
		this.chargeutile=c;
		this.choix=ch;
	}
	
	

}
