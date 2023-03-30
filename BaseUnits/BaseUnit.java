// Базовый класс героев

package BaseUnits;


import java.util.ArrayList;
import java.util.Random;

public abstract class BaseUnit implements UnitInterfase {

    protected int attack; // сила атаки
    protected String type; // тип героя
    protected int defense; // защита, если атака меньше защиты урон 1
    protected int minDamage; // минимальный урон 
    protected int maxDamage; //максилальный урон
    public int hp; // текущее здоровье
    protected int maxHp; // максимальное здоровье
    protected int speed; // скорость хода
    protected String name; // имя
    protected int deliver; // доставка стрел
    protected int magic; // магия
    protected Location location; // местоположение

    protected Random rnd = new Random();

    public BaseUnit(String type,int atack, int defense, int minDamage, int maxDamage, int hp,int maxHp, int speed, String name, int deliver, int magic, int x, int y) {
        this.type = type;
        this.attack = atack;
        this.defense = defense;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.hp = hp;
        this.maxHp = maxHp;
        this.speed = speed;
        this.name = name;
        this.deliver = deliver;
        this.magic = magic;
        location = new Location(x, y);
    }

    // атака героя 
    public void attack(BaseUnit target, int damage,int minDamage, int maxDamage) {
        int causedDamage; // получаемый урон
        if (damage < target.defense+1) causedDamage = 1; // если атака меньше защиты урон 1
        else {
            if (minDamage == maxDamage)  causedDamage = maxDamage;
            else  causedDamage = (new Random().nextInt(maxDamage - minDamage) + minDamage); // случайный выбор в диапазоне от минимума до максимума
        }
        target.getDamage(causedDamage); 
        this.printDamage(causedDamage);
    }
    // печать колличесва полученного урона
    public void printDamage(int causedDamage){
        System.out.println(causedDamage);
    }
    // получение урона
    public void getDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        } else
            this.hp = 0;
    }
    // получение скорости
    public int getSpeed() {
        return this.speed;
    }
    // печать информации о юните 
    @Override
    public String getInfo() {
        String outStr = String.format("\t%-3s\t⚔️ %-3d\t\uD83D\uDEE1 %-3d\t♥️%-3d%%\t☠️%-3d\t ", type, attack, defense,(int) hp * 100/maxHp,(minDamage + maxDamage)/2);
        return outStr;
    }
    // метод хода юнита
    @Override
    public void step(ArrayList<BaseUnit> team, ArrayList<BaseUnit> team2) {

    }

   
    // получение имени
    public String getName() {
        return name;
    }
    // получение позиции
    public Location getPosition() {
        return this.location;
    }
}
