package pokemons;

import moves.Rest;
import moves.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Porygon extends Pokemon {
    public Porygon(String name, int level){
        super(name, level);
        setType(Type.NORMAL);
        setStats(65, 60, 70, 85, 75, 40);
        setMove(new Thunderbolt(), new Rest());
    }
}
