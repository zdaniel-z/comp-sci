package pkg;

public class Movie{
    
    String movieName;
    double rating;
    int numRatings;
    int revenue;
    String revenueS = "";

    public Movie(){
        movieName = "Avengers";
        rating = 8.0;
        numRatings = 33;
        revenue = 623357910;
    }
    
    public Movie(String m, double rat, int numR, int rev){
        movieName = m;
        rating = rat;
        numRatings = numR;
        revenue = rev;
    }
    
    
    public void movieToString(){
        System.out.println("movie name:" + movieName);
        System.out.println("movie rating:" + rating);
        System.out.println("movie numRating:" + numRatings);
        System.out.println("movie revenue:" + revenue);
        System.out.println("");
        
    }
    
    
    public String getMovieName(){
        return movieName;
    }
    
    public int getRevenue(){
        return revenue;
    }
    
    public double getRating(){
        return rating;
    }
    
    public String revenueToString(){
        while(revenue>100){
            revenueS = revenueS+((revenue%1000)+",");
            revenue = revenue/1000;
        }
        return revenueS;
    }

    public double addRating(double a){
        int numRatings2 = numRatings+1;
        rating = (((rating*numRatings)+a)/numRatings2);
        numRatings++;
        return rating;
    }

    
    public boolean compareRatings(Movie b){
        if(b.getRating()<getRating()){
            return true;
        }
        else{
            return false;
        }
        
    }
    
}
