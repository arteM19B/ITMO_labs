package move.status_move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class IronDefense extends StatusMove {
    public IronDefense() {
        super(Type.STEEL, 0, 0);
    }

    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.DEFENSE, 2);
    }

    @Override
    protected String describe() {
        return "is using Iron Defense";
    }
}