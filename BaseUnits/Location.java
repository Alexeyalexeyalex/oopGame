package BaseUnits;

import java.util.ArrayList;

public class Location {
    protected int x;
    protected int y;
    
    public Location(int x, int y){
        this.x = x;
        this.y=y;
    }

    public boolean isEquals(Location opposit){
        if (opposit.y == y && opposit.x==x) return true;
        return false;
    }
    
    
    public float getDistance(BaseUnit unit){
      
        return (float)Math.sqrt(Math.pow(x - unit.location.x, 2) + Math.pow(y - unit.location.y, 2));
        
    }
    


    
    

}
