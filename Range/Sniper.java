package Range;

import BaseUnits.RangeHeroes;

public class Sniper extends RangeHeroes{

    public Sniper( int x, int y) {
        super(12,10,8,15,9,"Robert",0,0,32,x,y);
    }
    
    @Override
    public String getInfo() {
        return "Sniper";
    }

}
