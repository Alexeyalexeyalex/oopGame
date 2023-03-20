package Range;
import BaseUnits.MagicalHeroes;

public class Warlock extends MagicalHeroes{

    public Warlock( int x, int y) {
        super(17,12,-5,30,9,"Bruse",1,0,x,y);
    }

    @Override
    public String getInfo() {
        return "Warlock";
    }
}
