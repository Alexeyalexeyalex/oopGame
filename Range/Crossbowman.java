package Range;

import BaseUnits.RangeHeroes;

public class Crossbowman extends RangeHeroes {
 

    public Crossbowman() {
        super(100, 5, 3, true, "Арбалет", 4, 10);
    }

    @Override
    public String getInfo() {
        return "Crossbowman";
    }
}
