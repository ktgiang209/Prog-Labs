package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Mew extends Pokemon {
    public Mew(String name, int level){
        super(name, level);
        setType(Type.PSYCHIC);
        setStats(100, 100, 100, 100, 100, 100);
        setMove(new StoneEdge(), new FlameCharge(), new DoubleTeam(), new Bulldoze());
    }
}
