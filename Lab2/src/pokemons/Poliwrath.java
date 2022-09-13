package pokemons;

import moves.PoisonJab;
import ru.ifmo.se.pokemon.Type;

public class Poliwrath extends Poliwhirl{
    public Poliwrath(String name, int level){
        super(name, level);
        addType(Type.FIGHTING);
        setStats(90, 95, 95, 70,90, 70);
        addMove(new PoisonJab());
    }
}
