package BaseUnits;

import java.util.ArrayList;

public class Location {
    protected int x;
    protected int y;
    
    public Location(int x, int y){
        this.x = x;
        this.y=y;
    }

    
    public double getDistance(BaseUnit unit){
      
        return Math.sqrt(Math.pow(x - unit.location.x, 2) + Math.pow(y - unit.location.y, 2));
        
    }
    
    // public void setPosition(ArrayList<BaseUnit> leftTeam, ArrayList<BaseUnit> rightTeam, int position){
    //     if (leftTeam.contains(this)) {
    //         this.x = 0;
    //         this.y = position;
    //     }
    //     else{
    //         this.x = position;
    //         this.y = 0;
    //     }
    // }

    
    

}
