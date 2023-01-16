package Person;

import utility.ThingInterface;

public class Pyatachka implements ThingInterface {
    private String name;

    public Pyatachka(){
        name = "Пятачка";
        joinStory();
    }
    public Pyatachka(String name){
        this.name = name;
        joinStory();
    }

    private void joinStory(){
        System.out.println("('"+name + "' присоединились к истории)");
        System.out.println(name + "всем гостям дарили воздушные шарики");
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Pyatachka) {
            return name.equals(((Pyatachka) obj).getName());
        }
        return false;
    }
    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
