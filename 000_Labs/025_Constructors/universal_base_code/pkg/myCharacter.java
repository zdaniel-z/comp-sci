/*
 *	Author:  
 *  Date: 
*/
package pkg;
import java.util.*;

public class myCharacter{
	
	String role;
	int s;
	int d;
	int i;
	int c;
	
	public myCharacter(){
	role = "Wizard";
	s = 4;
	d = 5;
	i = 8;
	c = 3;
	}
	
	public void PrintStats(){
		System.out.println("Your class is "+role);
		System.out.println("strength: "+s);
		System.out.println("durability: "+d);
		System.out.println("intellegence: "+i);
		System.out.println("charisma: "+c);
		
	}
	
	public void nRole(){
	    role="no role";
	    System.out.println(role);
	}
	
	
	public void cRole(String role){
	    if(role=="Wizard" || role== "Warrior" || role=="Rogue"){
	        System.out.println(role);
	    }
	    else{
	        System.out.println("No role");
	    }
	}
	
	
}

