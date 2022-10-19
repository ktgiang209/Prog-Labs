import pokemons.*;
import ru.ifmo.se.pokemon.*;

class Battleground {
    public static void main(String args[]) {
        Battle b = new Battle();

        Cinccino p1 = new Cinccino ("ally", 1);
        Darkrai p2 = new Darkrai ("ally", 1);
        Minccino p3= new Minccino ("ally", 1);
        Porygon p4= new Porygon ("foe", 1);
        Porygon2 p5= new Porygon2 ("foe", 1);
        PorygonZ p6 = new PorygonZ ("foe", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}