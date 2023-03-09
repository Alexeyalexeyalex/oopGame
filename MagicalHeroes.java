public class MagicalHeroes extends BaseUnit{
    private int mana;

    public MagicalHeroes(int hp, int atack, int defense, boolean status, String weapon, int attackRange, int mana) {
        super(hp, atack, defense, status, weapon, attackRange);
        this.mana = mana;
    }

    public void restoreMana(){
        this.mana = 50;
    }
    
}
