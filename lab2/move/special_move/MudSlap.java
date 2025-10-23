package move.special_move;

import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class MudSlap extends SpecialMove {
    public MudSlap() {
        super(Type.GROUND, 20, 100);
    }

    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ACCURACY, -1);
    }

    @Override 
    protected String describe() {
        return "is using Mud-Slap";
    }
}