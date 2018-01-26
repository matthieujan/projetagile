package sparkexample;

import java.util.HashMap;

public class Demande {
	
	public String description;
	
	public String chargeutile ;
	
	public HashMap<String, String> choix ;
	
	public Demande(String d,String c,HashMap<String, String> ch) {
		
		this.description=d;
		this.chargeutile=c;
		this.choix=ch;
	}
	
	

}
