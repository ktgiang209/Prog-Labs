package moves;

import ru.ifmo.se.pokemon.*;

public class Bubble extends SpecialMove {
    public Bubble() { super(Type.WATER,40,100);}

    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random() < 0.1){
            p.setMod(Stat.SPEED, 1);
        }
    }
    @Override
    protected String describe() {
        return "using Bubble.\nThe target's Speed is lowering by one stage.";
    }
}
