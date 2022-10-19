package pokemons;

import moves.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Darkrai extends Pokemon {
    public Darkrai(String name, int level){
        super(name, level);
        setType(Type.DARK);
        setStats(70, 90, 90, 135, 90, 125);
        setMove(new SwordsDance(), new PoisonJab(), new WillOWisp(), new ShadowClaw());

    }
}
