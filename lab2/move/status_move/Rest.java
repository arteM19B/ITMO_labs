package move.status_move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    protected void applySelfEffects(Pokemon p) {
        Effect eff = new Effect();
        eff.turns(2);
        eff.condition(Status.SLEEP);
        p.setCondition(eff);
        p.restore();
    }

    @Override 
    protected String describe() {
        return "is falling asleep to restoring health";
    }
}