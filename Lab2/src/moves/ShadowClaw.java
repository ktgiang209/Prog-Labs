package moves;

import ru.ifmo.se.pokemon.*;

public class ShadowClaw extends PhysicalMove {
    public ShadowClaw(){ super(Type.GHOST, 70, 100);}

    @Override
    protected void applyOppEffects(Pokemon p){
        if(Math.random() < 0.1){
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
        }
    }
    @Override
    protected String describe(){
        return "uses Shadow Claw.";
    }

}
