package pokemon;

import ru.ifmo.se.pokemon.*;
import pokemon.Grubbin;
import move.special_move.*;
import move.physical_move.*;
import move.status_move.*;

public class Charjabug extends Grubbin {

    public Charjabug(String name, int level) {
        super(name, level);
        addType(Type.ELECTRIC);
        setStats(57, 82, 95, 55, 75, 36);
        addMove(new IronDefense());
    }
}