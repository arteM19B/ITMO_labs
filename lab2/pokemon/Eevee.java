package pokemon;

import ru.ifmo.se.pokemon.*;
import move.special_move.*;
import move.physical_move.*;
import move.status_move.*;

public class Eevee extends Pokemon {

    public Eevee(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(55, 55, 50, 45, 65, 55);
        setMove(new Rest(), new Swagger(), new Facade());
    }
}