package Range;
import BaseUnits.MagicalHeroes;

public class Monk extends MagicalHeroes{

    public Monk() {
        super(100, 2, 1, true, "Книга заклинаний", 4, 50);
    }
    
    @Override
    public String getInfo() {
        return "Monk";
    }
}
