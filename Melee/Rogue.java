package Melee;
import BaseUnits.MeleeHeroes;

public class Rogue extends MeleeHeroes{

    public Rogue() {
        super(8,3,3,10,3,"John",0,0);
    }

    @Override
    public String getInfo() {
        return "Rogue";
    }
    
    
}
