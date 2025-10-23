package pokemon;

import ru.ifmo.se.pokemon.*;
import move.special_move.*;
import move.physical_move.*;
import move.status_move.*;

public class Grubbin extends Pokemon {

    public Grubbin(String name, int level) {
        super(name, level);
        setType(Type.BUG);
        setStats(47, 62, 45, 55, 45, 46);
        setMove(new Swagger(), new MudSlap());
    }
}