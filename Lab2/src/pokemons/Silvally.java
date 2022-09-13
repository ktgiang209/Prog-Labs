package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Silvally extends Pokemon {
    public Silvally(String name, int level){
        super(name, level);
        setType(Type.NORMAL);
        setStats(95, 95, 95, 95, 95, 95);
        setMove(new Rest(), new MetalSound(), new ThunderWave());
    }
}
