import java.util.ArrayList;
import java.util.Random;
import BaseUnits.BaseUnit;
import Melee.Pikeman;
import Melee.Rogue;
import Melee.Villager;
import Range.Crossbowman;
import Range.Monk;
import Range.Sniper;
import Range.Warlock;

public class Main {
    public static void main(String[] args) {
        ArrayList<BaseUnit> list = new ArrayList<>();
        ArrayList<BaseUnit> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            switch (new Random().nextInt(7)) {
                case 0:
                    list.add(new Pikeman());
                    break;
                case 1:
                    list.add(new Rogue());
                    break;
                case 2:
                    list.add(new Villager());
                    break;
                case 3:
                    list.add(new Crossbowman());
                    break;
                case 4:
                    list.add(new Monk());
                    break;
                case 5:
                    list.add(new Sniper());
                    break;
                case 6:
                    list.add(new Warlock());
                    break;

            }
            switch (new Random().nextInt(3)) {
                case 0:
                    list2.add(new Pikeman());
                    break;
                case 1:
                    list2.add(new Rogue());
                    break;
                case 2:
                    list2.add(new Villager());
                    break;
                case 3:
                    list2.add(new Crossbowman());
                    break;
                case 4:
                    list2.add(new Monk());
                    break;
                case 5:
                    list2.add(new Sniper());
                    break;
                case 6:
                    list2.add(new Warlock());
                    break;
            }
        }
    
        ArrayList<BaseUnit> allUnits = new ArrayList<>();
        allUnits.addAll(list);
        allUnits.addAll(list2);
        for (BaseUnit baseUnit : allUnits) {
            System.out.println(baseUnit.getInfo());
        }
        
    }
}
