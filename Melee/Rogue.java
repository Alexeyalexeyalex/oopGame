package Melee;
import BaseUnits.MeleeHeroes;

public class Rogue extends MeleeHeroes{

    public Rogue() {
        super(100, 6, 4, true, "Кинжал",1);
    }

    @Override
    public String getInfo() {
        return "Rogue";
    }
    
    
}
