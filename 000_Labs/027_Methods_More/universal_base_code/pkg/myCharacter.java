/*
 *	Author:  
 *  Date: 
*/
package pkg;
import java.util.*;

public class myCharacter{
	
	String role;
	int stren;
	int dexter;
	int intel;
	int charisma;
	
	
	public myCharacter(){
	role = "No role";
	}
	
	public myCharacter(String r){
		role = r;
	}
	
	
	public void setRole(String r){
		role = r;
	}
	
	public void setStrength(int s){
	    if(s<0){
	    	stren = 0;
	    }
	    else{
	        stren = s;
	    }
	}
	
	public void setDexterity(int d){
	    dexter = d;
	}
	
	public void setIntelligence(int i){
	    intel = i;
	}
	
	public void setCharisma(int c){
	    charisma = c;
	}
	
	public boolean setAll(String role, int s, int d, int i, int c){
	    	return true;
	    }
	
	
	public void myToString(){
	    System.out.println("your role is "+ role);
	    System.out.println("your streght is "+ stren);
	    System.out.println("your intellegence is "+ intel);
	    System.out.println("your durability is "+ dexter);
	    System.out.println("your charisma is "+ charisma);
	
}
}

