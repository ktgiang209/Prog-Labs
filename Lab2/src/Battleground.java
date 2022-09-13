import pokemons.*;
import ru.ifmo.se.pokemon.*;

class Battleground {
    public static void main(String args[]) {
        Battle b = new Battle();

        Mew p1 = new Mew ("ally", 1);
        Minior p2 = new Minior ("ally", 1);
        Poliwag p3= new Poliwag ("ally", 1);
        Poliwhirl p4= new Poliwhirl ("foe", 1);
        Poliwrath p5= new Poliwrath ("foe", 1);
        Silvally p6 = new Silvally ("foe", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}