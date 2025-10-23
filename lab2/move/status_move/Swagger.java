package move.status_move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL, 0, 85);
    }

    protected void applyOppEffects(Pokemon p) {
        Effect.confuse(p);
        p.setMod(Stat.ATTACK, 2);
    }

    @Override 
    protected String describe() {
        return "is confusing the target and raising its Attack by two stages";
    }
}