package Person;

import utility.ThingInterface;

public class KistoferRobin implements ThingInterface {
    private String name;
    public boolean attheparty;
    public KistoferRobin(){
        name = "Кристофер Робин";
        attheparty = true;
        joinStory();
    }

    public KistoferRobin(String name){
        this.name = name;
        attheparty = true;
        joinStory();
    }

    private void joinStory() {
        System.out.println("('"+name + "' присоединились к истории)");
        if (attheparty) {
            System.out.println(name + " был на вечере у своего друга Пятачка");
        } else {
            System.out.println(" кто-то подслушивает");
            System.exit(0);
        }
    }
    public void greenballoon(){
        System.out.println(name +" достался большущий зеленый шар");
    }
    public void blueballon(){
        System.out.println("поэтому "+name+" пришлось, так и быть, захватить с собой оба шара-- и зеленый и синий.");
    }
    public boolean isAttheparty(){
        return attheparty;
    }

    @Override
    public String getName(){
        return name;
    }
    @Override
    public String toString() {
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof KistoferRobin) {
            return name.equals(((KistoferRobin) obj).getName()) && attheparty == ((KistoferRobin) obj).isAttheparty();
        }
        return false;
    }
    @Override
    public int hashCode() {
        if (attheparty) return name.hashCode() + name.length();
        return name.hashCode();
    }
}
