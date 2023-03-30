// основной класс героев исцеления
package BaseUnits;

import java.util.ArrayList;

public abstract class MagicalHeroes extends BaseUnit {
    private int mana;

    public MagicalHeroes(String type, int atack, int defense, int minDamage, int maxDamage, int hp, int maxHp,
            int speed, String name, int magic, int deliver, int x, int y, int mana) {
        super(type, atack, defense, minDamage, maxDamage, hp, maxHp, speed, name, magic, deliver, x, y);
        this.mana = mana;
    }

    // ход юнита
    @Override
    public void step(ArrayList<BaseUnit> team, ArrayList<BaseUnit> friends) {
        if (this.hp > 0) {

            BaseUnit target = null; // цель

            // выбор цели
            for (BaseUnit unit : friends) {
                if (unit.hp < unit.maxHp + this.maxDamage) {
                    target = unit;
                }
            }

            // нанесение отрицательного урона
            if (target != null) {
                if (this.mana > 0) {
                    System.out.printf("%s Вылечил %s на ", this.getClass().getSimpleName(),
                        target.getClass().getSimpleName());
                    this.attack(target, this.attack, this.minDamage, this.maxDamage);
                    this.mana--;
                }
            }

        }

    }
    // своя печать урона(лечения)
    @Override
    public void printDamage(int causedDamage){
        System.out.println(-causedDamage);
    }
}
