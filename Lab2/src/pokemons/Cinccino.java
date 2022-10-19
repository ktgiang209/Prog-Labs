package pokemons;

import moves.FocusBlast;
import pokemons.Minccino;

public class Cinccino extends Minccino{
    public Cinccino(String name, int level){
        super(name, level);
        setStats(75, 95, 60, 65, 60, 115);
        addMove(new FocusBlast());
    }
}
