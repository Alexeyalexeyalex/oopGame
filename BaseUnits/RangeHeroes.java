package BaseUnits;

import java.util.ArrayList;

public abstract class RangeHeroes extends BaseUnit {

    private int arrows;

    public RangeHeroes(String type,int atack, int defense, int minDamage,int maxDamage, int hp,int maxHp, int speed, String name, int magic,int deliver,int arrows, int x, int y) {
        super(type,atack, defense, minDamage,maxDamage, hp,maxHp, speed, name, magic, deliver,x,y);
        this.arrows = arrows;
    }

    public void TakeArrows(int arrows) {
        this.arrows += arrows;
    }

    @Override
    public void step(ArrayList<BaseUnit> team, ArrayList<BaseUnit> friends) {
        if (this.arrows > 0 && this.hp > 0) {
            System.out.println("Могу стрелять!");
            int maxDistance = 20;
            for (BaseUnit unit : team) {
                if (unit.hp > 0 ) {//&& unit.location.getDistance(unit)>maxDistance
                    // maxDistance = (int)unit.location.getDistance(unit);
                    this.attack(unit);
                    this.arrows--;
                    break;
                }
            }
            // for (BaseUnit unit : team) {
            //     if (unit.location.getDistance(unit) == maxDistance){
            //         this.attack(unit);
            //         this.arrows--;
            //         break;
            //     }
            // }
            System.out.println("Осталось стрел:" + String.valueOf(this.arrows));

            for (BaseUnit unit : friends) {
                if (unit.getInfo().equals("Villager")) {
                    System.out.println("Крестьянин приносит стрелу!");
                    this.arrows++;
                    break;
                }
            }
            System.out.println("Осталось стрел:" + String.valueOf(this.arrows));

        }
        

    }
}
