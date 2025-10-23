package move.special_move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class IceBeam extends SpecialMove {
    public IceBeam() {
        super(Type.ICE, 90, 100);
    }

    protected void applyOppEffects(Pokemon p) {
        if (Math.random() < 0.1) {
            Effect.freeze(p);
        }
    }

    @Override
    protected String describe() {
        return "using Ice Beam";
    }
}