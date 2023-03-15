package BaseUnits;
// import BaseUnits.UnitInterfase;

import java.util.ArrayList;
import java.util.Random;

public abstract class BaseUnit implements UnitInterfase {

    protected int attack;
    protected int defense;
    protected int damage;
    protected int hp;
    protected int speed;
    protected String name;
    protected int deliver;
    protected int magic;

    protected Random rnd = new Random();

    public BaseUnit(int atack, int defense, int damage, int hp, int speed, String name, int deliver, int magic) {
        this.attack = atack;
        this.defense = defense;
        this.damage = damage;
        this.hp = hp;
        this.speed = speed;
        this.name = name;
        this.deliver = deliver;
        this.magic = magic;
    }

    public void GetDamage(int damage) {

        this.hp -= damage;
    }

    public void attack(BaseUnit target, int damage) {
        int causedDamage = rnd.nextInt(1, damage);
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
        return "BaseUnit";
    }

    @Override
    public void step(ArrayList<BaseUnit> team, ArrayList<BaseUnit> team2) {

    }



   
    
}
