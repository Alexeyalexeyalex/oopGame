package Range;

import BaseUnits.RangeHeroes;

public class Sniper extends RangeHeroes{

    public Sniper() {
        super(100, 5, 1, true, "Арбалет", 6, 7);
    }
    
    @Override
    public String getInfo() {
        return "Sniper";
    }

}
