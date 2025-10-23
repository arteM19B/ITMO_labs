package move.special_move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class DrainingKiss extends SpecialMove {
    public DrainingKiss() {
        super(Type.FAIRY, 50, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        int healAmount = (int) (50 * 0.75);
        p.setMod(Stat.HP, healAmount);
    }

    @Override 
    protected String describe() {
        return "uses Draining Kiss and heals itself";
    }
}