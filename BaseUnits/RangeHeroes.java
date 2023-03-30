// основной класс героев дальнего боя
package BaseUnits;

import java.util.ArrayList;

public abstract class RangeHeroes extends BaseUnit {

    private int arrows;

    public RangeHeroes(String type,int atack, int defense, int minDamage,int maxDamage, int hp,int maxHp, int speed, String name, int magic,int deliver,int arrows, int x, int y) {
        super(type,atack, defense, minDamage,maxDamage, hp,maxHp, speed, name, magic, deliver,x,y);
        this.arrows = arrows;
    }

    // ход юнита
    @Override
    public void step(ArrayList<BaseUnit> team, ArrayList<BaseUnit> friends) {
        if (this.arrows > 0 && this.hp > 0) {

            BaseUnit target = null;
            double minDistance = Double.MAX_VALUE;

            // выбор цели
            for (BaseUnit unit : team) {
                if(this.location.getDistance(unit)<minDistance && unit.hp>0){
                    minDistance = this.location.getDistance(unit);
                    target = unit;
                }
            }
            if (target == null) {
                System.out.printf("%s Говорит что бой окончен\n", this.getClass().getSimpleName());
            }
            // нанесение урона
            else{
                System.out.printf("%s Атаковал %s на ", this.getClass().getSimpleName(), target.getClass().getSimpleName());
                this.attack(target, this.attack, this.minDamage, this.maxDamage);
                this.arrows--;

                // поиск определенного юнита для восполнения стрел
                for (BaseUnit unit : friends) {
                    if (unit.getInfo().equals("Villager") && unit.hp>0) {
                        this.arrows++;
                        break;
                    }
                }
            }

        }
        

    }

    @Override
    public String toString() {
        return "Осталось стрел: " + String.valueOf(this.arrows);
    }

}
