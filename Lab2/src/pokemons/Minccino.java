package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Minccino extends Pokemon {
    public Minccino(String name, int level){
        super(name, level);
        setType(Type.NORMAL);
        setStats(55, 50, 40, 40, 40, 75);
        setMove(new WorkUp(), new DazzlingGleam(), new ThunderWave());
    }
}
