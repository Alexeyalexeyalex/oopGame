package Melee;
import BaseUnits.MeleeHeroes;

public class Villager extends MeleeHeroes{

    public Villager() {
        super(1,1,1,1,3,"Lee",0,1);
    }
    
    @Override
    public String getInfo() {
        return "Villager";
    }
}
