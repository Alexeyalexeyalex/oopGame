package Range;

import BaseUnits.RangeHeroes;

public class Sniper extends RangeHeroes{

    public Sniper() {
        super(12,10,8,15,9,"Robert",0,0,32);
    }
    
    @Override
    public String getInfo() {
        return "Sniper";
    }

}
