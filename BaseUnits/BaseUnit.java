package BaseUnits;
// import BaseUnits.UnitInterfase;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseUnit implements UnitInterfase {

    protected int attack;
    protected String type;
    protected int defense;
    protected int minDamage;
    protected int maxDamage;
    public int hp;
    protected int maxHp;
    protected int speed;
    protected String name;
    protected int deliver;
    protected int magic;
    protected Location location;

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


    public void attack(BaseUnit target, int damage,int minDamage, int maxDamage) {
        int causedDamage;
        if (damage < target.defense+1) causedDamage = 1;
        else {
            if (minDamage == maxDamage)  causedDamage = maxDamage;
            else  causedDamage = (new Random().nextInt(maxDamage - minDamage) + minDamage);
        }
        target.getDamage(causedDamage);
        System.out.println(causedDamage);
    }

    public void getDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        } else
            this.hp = 0;
    }

    public int getSpeed() {
        return this.speed;
    }

    @Override
    public String getInfo() {
        String outStr = String.format("\t%-3s\t⚔️ %-3d\t\uD83D\uDEE1 %-3d\t♥️%-3d%%\t☠️%-3d\t ", type, attack, defense,(int) hp * 100/maxHp,(minDamage + maxDamage)/2);
        return outStr;
    }

    @Override
    public void step(ArrayList<BaseUnit> team, ArrayList<BaseUnit> team2) {

    }

   

    public String getName() {
        return name;
    }

    public Location getPosition() {
        return this.location;
    }
}
