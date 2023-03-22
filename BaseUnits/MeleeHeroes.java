package BaseUnits;

public abstract class MeleeHeroes extends BaseUnit {

    public MeleeHeroes(String type,int atack, int defense, int minDamage,int maxDamage, int hp,int maxHp, int speed, String name, int magic,int deliver, int x, int y) {
        super( type,atack, defense, minDamage,maxDamage, hp,maxHp, speed, name, magic, deliver,x,y);
    }

}
