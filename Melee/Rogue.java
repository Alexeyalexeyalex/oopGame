package Melee;
import BaseUnits.MeleeHeroes;

public class Rogue extends MeleeHeroes{

    public Rogue( int x, int y) {
        super(8,3,3,10,3,"John",0,0,x,y);
    }

    @Override
    public String getInfo() {
        return "Rogue";
    }
    
    
}
