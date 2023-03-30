// основной класс героев ближнего боя
package BaseUnits;

import java.util.ArrayList;

public abstract class MeleeHeroes extends BaseUnit {
    int stamina;

    public MeleeHeroes(String type,int atack, int defense, int minDamage,int maxDamage, int hp,int maxHp, int speed, String name, int magic,int deliver, int x, int y, int stamina) {
        super( type,atack, defense, minDamage,maxDamage, hp,maxHp, speed, name, magic, deliver,x,y);
        this.stamina = stamina;
    }

    // ход юнита
    @Override
    public void step(ArrayList<BaseUnit> team, ArrayList<BaseUnit> friends){
        if (this.stamina > 0 && this.hp > 0) {
    
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
            else{
                //проверка доступности героев(расстояние)
                if(this.location.getDistance(target)>=2){
                    this.location.direction(target.location, friends);
                }
                // нанесение урона
                else if(target.hp > 0){
                    System.out.printf("%s Атаковал %s на ", this.getClass().getSimpleName(), target.getClass().getSimpleName());
                    this.attack(target, this.attack,this.minDamage, this.maxDamage);
                    this.stamina--;
                }
            }
            
        }
    }

}
