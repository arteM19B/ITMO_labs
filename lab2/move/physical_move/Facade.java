package move.physical_move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }
    
    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        double baseDamage = super.calcBaseDamage(att, def);
        Status cond = def.getCondition();
        if (cond.equals(Status.BURN) || cond.equals(Status.POISON) || cond.equals(Status.PARALYZE)) {
            return baseDamage * 2;
        }
        return baseDamage;
    }

    @Override
    protected String describe() {
        return "attacks powerfully";
    }
}