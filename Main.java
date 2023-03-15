import java.util.ArrayList;
import java.util.Comparator;
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
            switch (new Random().nextInt(4)) {
                case 0:
                    list.add(new Villager());
                    break;
                case 1:
                    list.add(new Rogue());
                    break;
                case 2:
                    list.add(new Sniper());
                    break;
                case 3:
                    list.add(new Warlock());
                    break;
            }
            switch (new Random().nextInt(4)) {
                case 0:
                    list2.add(new Villager());
                    break;
                case 1:
                    list2.add(new Pikeman());
                    break;
                case 2:
                    list2.add(new Crossbowman());
                    break;
                case 3:
                    list2.add(new Monk());
                    break;
            }
        }
    
        ArrayList<BaseUnit> allUnits = new ArrayList<>();
        allUnits.addAll(list);
        allUnits.addAll(list2);
        // for (BaseUnit baseUnit : allUnits) {
        //     System.out.println(baseUnit.getInfo());
        // }
        allUnits.sort(new Comparator<BaseUnit>() {
            @Override
            public int compare(BaseUnit u1, BaseUnit u2) {
                if (u1.getSpeed() == u2.getSpeed())
                    return 0;
                else if (u1.getSpeed() > u2.getSpeed())
                    return 1;
                else
                    return -1;
            }
        });

        System.out.println(allUnits);

        // list.forEach(u -> u.step(list2, list));
        for (BaseUnit baseUnit : allUnits) {
            baseUnit.step(list2, list);
        }
        
    }
}
