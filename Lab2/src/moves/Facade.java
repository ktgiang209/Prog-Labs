package moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Status p_stat = p.getCondition();
        if (p_stat.equals(Status.BURN) || p_stat.equals(Status.POISON)
                || p_stat.equals(Status.PARALYZE)) {
            power = 2*power;
        }
    }
    @Override
    protected String describe() {
        return "using Facade";
    }
}