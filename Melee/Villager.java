// класс ближнего боя, а также доставки стрел
package Melee;
import BaseUnits.MeleeHeroes;

public class Villager extends MeleeHeroes{

    public Villager( int x, int y) {
        super("Villager",1,1,1,1,1,1,3,"Villager",0,1,x,y,100);
    }
}
