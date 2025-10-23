package pokemon;

import ru.ifmo.se.pokemon.*;
import move.special_move.*;
import move.physical_move.*;
import move.status_move.*;

public class Cryogonal extends Pokemon {

    public Cryogonal(String name, int level) {
        super(name, level);
        setType(Type.ICE);
        setStats(80, 50, 50, 95, 135, 105);
        setMove(new PoisonJab(), new DoubleTeam(), new IceBeam(), new AncientPower());
    }
}