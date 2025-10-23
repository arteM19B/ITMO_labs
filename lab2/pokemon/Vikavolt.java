package pokemon;

import ru.ifmo.se.pokemon.*;
import pokemon.Charjabug;
import move.special_move.*;
import move.physical_move.*;
import move.status_move.*;

public class Vikavolt extends Charjabug {

    public Vikavolt(String name, int level) {
        super(name, level);
        setStats(77, 70, 90, 145, 75, 43);
        addMove(new Swagger());
    }
}