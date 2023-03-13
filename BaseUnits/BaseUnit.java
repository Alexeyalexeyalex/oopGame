package BaseUnits;
// import BaseUnits.UnitInterfase;

public abstract class BaseUnit implements UnitInterfase{

    private int hp;
    private int atack;
    private int defense;
    private boolean status;
    private String weapon;
    private int attackRange;

    
    public BaseUnit(int hp, int atack, int defense, boolean status, String weapon, int attackRange) {
        this.hp = hp;
        this.atack = atack;
        this.defense = defense;
        this.status = status;
        this.weapon = weapon;
        this.attackRange = attackRange;
    }

    public String GetInfo(){
        return String.format("Hp: %d attakRange: %d", this.hp, this.attackRange); 
    }


    public void GetDamage(int damage){
        
        this.hp -= damage; 
    }

    public void GetHeal(int heal){
        this.hp += heal;
    }

    @Override
    public String getInfo(){
        return "BaseUnit";
    }

    @Override
    public void step() {
        
    }

    
   
}
