/* 
    Lecture note example - Classes
*/
package pkg;

public class Cow{
    //global variables
    int numOfSpots;
    String flavor;
    boolean isBeef;
    int moosPerHour;
    
    //constructors
    public Cow(){
        numOfSpots = 17;
        flavor = "Waygu";
        isBeef = false;
        if(isBeef){
            moosPerHour = 0;
        }
        else{
            moosPerHour = 87;
        }
        }
        
        public Cow(int n, String f, boolean b){
            numOfSpots = n;
            flavor = f;
            isBeef = b;
            if(isBeef){
            moosPerHour = 0;
            }
            else{
                moosPerHour = 87;
            }
        }
        
        public String getFlavor(){
            return flavor;
        }
        
        public void moo(){
        if(!isBeef){
            int c = 0;
            while(c<moosPerHour){
                System.out.println("MOOO");
                c++;
            }
            }
            else{
                System.out.print("your cow is a beef");
            }
        }
        
        
    }
    
    
    
