package BaseUnits;
public abstract class RangeHeroes extends BaseUnit {
    
    private int arrows;

    public RangeHeroes(int hp, int atack, int defense, boolean status, String weapon, int attackRange, int arrows) {
        super(hp, atack, defense, status, weapon, attackRange);
        this.arrows = arrows;
    }

    public void TakeArrows(int arrows){
        this.arrows += arrows;
    }
}
