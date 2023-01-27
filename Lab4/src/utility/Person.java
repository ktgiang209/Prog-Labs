package utility;

import utility.Balloon;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Person {
    protected String name;
    protected boolean atTheParty;
    protected boolean smallPerson;
    protected List<Balloon> balloons;
    public void joinStory(){
        System.out.println("('"+name + "' присоединились к истории)");
    }

    public Person(String name, boolean atTheParty, boolean smallPerson){
        this.name = name;
        this.atTheParty = atTheParty;
        this.smallPerson= smallPerson;
        balloons = new ArrayList<>();
    }

    public String getName(){
        return " "+name + " ";
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAtTheParty() {
        return atTheParty;
    }

    public void setAtTheParty(boolean atTheParty) {
        this.atTheParty = atTheParty;
    }

    public boolean isSmallPerson() {
        return smallPerson;
    }

    public void setSmallPerson(boolean smallPerson) {
        this.smallPerson = smallPerson;
    }


    public void setBalloons(List<Balloon> balloons) {
        this.balloons = balloons;
    }

    public void addBalloon(Balloon balloon){
        balloons.add(balloon);
    }

    public List<Balloon> getBalloons() {
        return balloons;
    }

    public String getBalloonsNames(){
        return balloons.stream()
                .map(Balloon::getColorName)
                .collect(Collectors.joining(", "));
    }
    public String getBalloonsSize(){
        return balloons.stream()
                .map(Balloon::getBalloonSize)
                .collect(Collectors.joining(", "));
    }

    public String more(String more){
        return more+"-"+more;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return atTheParty == person.atTheParty && smallPerson == person.smallPerson && Objects.equals(name, person.name) && Objects.equals(balloons, person.balloons);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, atTheParty, smallPerson, balloons);
    }
}
