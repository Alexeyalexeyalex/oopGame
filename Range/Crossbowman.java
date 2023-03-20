package Range;

import BaseUnits.RangeHeroes;

public class Crossbowman extends RangeHeroes {
 

    public Crossbowman( int x, int y) {
        super(6,3,6,10,4,"Kretch",0,0,16,x,y);
    }

    @Override
    public String getInfo() {
        return "Crossbowman";
    }
}
