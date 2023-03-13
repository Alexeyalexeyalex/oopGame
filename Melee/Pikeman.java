package Melee;
import BaseUnits.MeleeHeroes;

public class Pikeman extends MeleeHeroes{

    public Pikeman() {
        super(100, 4, 6, true, "Копье",2);
    }

    @Override
    public String getInfo() {
        return "Pikeman";
    }
    
}
