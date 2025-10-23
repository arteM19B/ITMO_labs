import ru.ifmo.se.pokemon.*;
import pokemon.*;
import move.special_move.*;
import move.physical_move.*;
import move.status_move.*;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        b.addAlly(new Vikavolt("", 1));
        b.addFoe(new Sylveon("", 1));    
        b.go();
    }
}