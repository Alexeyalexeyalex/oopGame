package Melee;
import BaseUnits.MeleeHeroes;

public class Pikeman extends MeleeHeroes{

    public Pikeman() {
        super(4,5,2,10,4,"Greg",0,0);
    }

    @Override
    public String getInfo() {
        return "Pikeman";
    }
    
}
