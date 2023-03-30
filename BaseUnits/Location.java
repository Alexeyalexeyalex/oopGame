// класс хранящий в себе информацию о расположении юнита
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
    

    public void direction(Location location, ArrayList<BaseUnit> friends) {
        boolean[] temp = checkPos(friends);
        float dx = Math.abs(this.x - location.x);
        float dy = Math.abs(this.y - location.y);
        if ((dx > dy)) {
            if (this.x < location.x && !temp[0] && this.x + 1 != 11) {
                this.x += 1;
                return;
            } else if (this.x > location.x && !temp[1] && this.x - 1 != 0) {
                this.x -= 1;
                return;
            }
            if (this.y <= location.y && !temp[2]&& this.y + 1 != 11) {
                this.y += 1;
                return;
            } else if (this.y >= location.y && !temp[3]&& this.y - 1 != 0) {
                this.y -= 1;
                return;
            }
        } else {
            if (this.y < location.y && !temp[2] && this.y + 1 != 11) {
                this.y += 1;
                return;
            } else if (this.y > location.y && !temp[3] && this.x - 1 != 0) {
                this.y -= 1;
                return;
            }
            if (this.x <= location.x && !temp[0]&& this.x + 1 != 11) {
                this.x += 1;
                return;
            } else if (this.x >= location.x && !temp[1]&& this.x - 1 != 0) {
                this.x -= 1;
                return;
            }
        }
    }
    
    public boolean[] checkPos(ArrayList<BaseUnit> friends) {
        boolean[] temp = new boolean[4];
        for (BaseUnit u : friends) {
            if ((u.location.x == this.x + 1) && (u.location.y == this.y))
                temp[0] = true;
            if ((u.location.x == this.x - 1) && (u.location.y == this.y))
                temp[1] = true;
            if ((u.location.x == this.x) && (u.location.y == this.y + 1))
                temp[2] = true;
            if ((u.location.x == this.x) && (u.location.y == this.y - 1))
                temp[3] = true;
        }
        return temp;
    }
    

}
