package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Minior extends Pokemon {
    public Minior(String name, int level) {
        super(name, level);
        setType(Type.ROCK, Type.FLYING);
        setStats(60, 60, 100, 60, 100, 60);
        setMove(new Rest(), new MetalSound(), new ThunderWave());
    }
}
