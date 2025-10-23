package pokemon;

import ru.ifmo.se.pokemon.*;
import pokemon.Eevee;
import move.special_move.*;
import move.physical_move.*;
import move.status_move.*;

public class Sylveon extends Eevee {

    public Sylveon(String name, int level) {
        super(name, level);
        setType(Type.FAIRY);
        setStats(95, 65, 65, 110, 130, 60);
        addMove(new DrainingKiss());
    }
}