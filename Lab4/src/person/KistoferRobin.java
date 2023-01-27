package person;

import utility.Balloon;
import utility.Home;
import utility.Person;
import utility.theEndException;

public class KistoferRobin extends Person {
    public KistoferRobin(){
        super("Кристофер Робин", true,false);
        addBalloon(new Balloon("GREEN", "VERYBIG"));
        joinStory();
        join();
    }

    public class Friend extends Person {
        public Friend(){
            super("Друзья", true, false);
            addBalloon(new Balloon("BLUE", "BIG"));
            joinStory();
            join();
        }
        private void join() {
            System.out.println(getName()+"взяли с собой синий шар,");
        }
    }
    public class home extends Home {
        public home(){
            super("в том же лесу","GREEN");
            System.out.println(" который жил "+getPlace()+", "+homeName()+".");
        }
    }
    private void join() {
        System.out.println(getName()+"ничего не сказал, но глаза его становились все "+more("больше")+", а щеки все "+more("розовели")+".");
    }

    public void joinParty(){
        if (atTheParty) {
            System.out.println(getName() + "был на вечере у своего друга Пятачка");
        } else {
            System.out.println("кто-то подслушивает");
            System.exit(0);
        }
    }
    public void greenBalloon(){
        System.out.println(getName() +"достался " + getBalloonsSize() +" "+ getBalloonsNames() + " шар");
    }
    public void blueBalloon(){
        addBalloon(new Balloon("BLUE", "BIG"));
        System.out.println("поэтому" + getName() + "пришлось, так и быть, захватить с собой оба шара-- и " + getBalloonsNames() + ".");
    }
    public void goCamp() throws theEndException{
        System.out.println(getName()+", как всегда (просто на всякий случай), захватил свое ружье, и оба отправились в поход.");
        throw new theEndException("THE END");
    }

}
