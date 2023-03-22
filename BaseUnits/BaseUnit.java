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
        this.hp = hp;
        this.maxHp = maxHp;
        this.speed = speed;
        this.name = name;
        this.deliver = deliver;
        this.magic = magic;
        location = new Location(x, y);
    }


    public void attack(BaseUnit target) {
        int causedDamage = minDamage;
        if (this.minDamage<this.maxDamage){causedDamage = rnd.nextInt(this.minDamage, this.maxDamage);}
        System.out.printf("%s атакует %s\t", this.name, target.name);
        System.out.printf("Наносит %d урона\n", causedDamage);
        target.getDamage(target, causedDamage);
        System.out.printf("%s hp= %d\n", target.getClass().getSimpleName(), target.hp);
    }

    public void getDamage(BaseUnit target,int damage) {
        if (target.hp - damage > 0) {
            target.hp -= damage;
        } else
            target.hp = 0;
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
