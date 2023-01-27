package person;

import utility.Person;

public class Pyatachka extends Person {

    public Pyatachka(){
        super("Пятачка", true,false);
        joinStory();
        join();
    }
    private void join(){
        if(atTheParty){
            System.out.println(getName() + "всем гостям дарили воздушные шарики");
        }
        else{
            System.out.println(getName() + "не устроил вечеринку");
            System.exit(0);
        }

    }
}
