public class StepTracker{
    
    int steps = 0;
    int activeDays = 0;
    int days = 0;
    double a;
    int minSteps;
    
    
    public StepTracker(int minstep){
        minSteps = minstep;
    }
    
    public void addDailySteps(s){
        steps=steps+s;
        days++;
        if(s>minSteps){
            activeDays++;
        }
    }
    
    public int activeDays(){
        return activeDays;
    }
    
    public double averageSteps(){
        a = (steps/days);
        return a;
    }
}