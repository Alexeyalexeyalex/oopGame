package BaseUnits;

import java.util.ArrayList;

public abstract class RangeHeroes extends BaseUnit {

    private int arrows;

    public RangeHeroes(int atack, int defense, int damage, int hp, int speed, String name, int magic,int deliver,int arrows) {
        super(atack, defense, damage, hp, speed, name, magic, deliver);
        this.arrows = arrows;
    }

    public void TakeArrows(int arrows) {
        this.arrows += arrows;
    }

    @Override
    public void step(ArrayList<BaseUnit> team, ArrayList<BaseUnit> friends) {
        if (this.arrows > 0 && this.hp > 0) {
            System.out.println("Могу стрелять!");
            for (BaseUnit unit : team) {
                if (unit.hp > 0) {
                    this.attack(unit, this.damage);
                    this.arrows--;
                    break;
                }
            }
        }
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
