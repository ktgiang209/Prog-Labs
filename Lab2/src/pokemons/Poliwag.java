package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Poliwag extends Pokemon {
    public Poliwag(String name, int level){
        super(name, level);
        setType(Type.WATER);
        setStats(40, 50, 40, 40, 40, 90);
        setMove(new Hypnosis(), new Facade());
    }
}
