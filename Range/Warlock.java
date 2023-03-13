package Range;
import BaseUnits.MagicalHeroes;

public class Warlock extends MagicalHeroes{

    public Warlock() {
        super(100, 5, 1, true, "Посох", 4, 50);
    }

    @Override
    public String getInfo() {
        return "Warlock";
    }
}
