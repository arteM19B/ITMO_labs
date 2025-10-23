package move.physical_move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class PoisonJab extends PhysicalMove {
    public PoisonJab() {
        super(Type.POISON, 80, 100);
    }

    protected void applyOppEffects(Pokemon p){
        if (Math.random() < 0.3) {
            Effect.poison(p);
        }
    }

    @Override
    protected String describe() {
        return "using Poison Jab";
    }
}