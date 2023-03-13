package Melee;
import BaseUnits.MeleeHeroes;

public class Villager extends MeleeHeroes{

    public Villager() {
        super(100, 1, 0, true, "Кулак",1);
    }
    
    @Override
    public String getInfo() {
        return "Villager";
    }
}
