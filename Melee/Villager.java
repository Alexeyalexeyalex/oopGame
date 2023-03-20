package Melee;
import BaseUnits.MeleeHeroes;

public class Villager extends MeleeHeroes{

    public Villager( int x, int y) {
        super(1,1,1,1,3,"Lee",0,1,x,y);
    }
    
    @Override
    public String getInfo() {
        return "Villager";
    }
}
