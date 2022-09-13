package moves;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {
    public StoneEdge() {
        super(Type.ROCK, 100, 80);
    }

    @Override
    protected double calcCriticalHit(Pokemon att, Pokemon def){
        if (Math.random() < (att.getStat(Stat.SPEED)*3/512)) {
            return 2.0;
        }
        else {
            return 1.0;
        }
    }

    @Override
    protected String describe() {
        return "using Stone Edge";
    }
}
