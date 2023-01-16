package Person;

import utility.*;

public class rodiznakkrolika extends DirectionAbstract{
    private String name;
    private final DirectionType TYPE = DirectionType.SMALL;
    public rodiznakkrolika(){
        super(true);
        name = "Родные и Знакомые Кролики";
        joinStory();
    }
    public rodiznakkrolika(String name){
        super(true);
        this.name = name;
        joinStory();
    }
    public rodiznakkrolika(String name, boolean smallperson){
        super(smallperson);
        this.name = name;
        joinStory();
    }
    private void joinStory(){
        System.out.println("('"+name + "' присоединились к истории)");
        System.out.println("одному из " +name+" приготовили большой-пребольшой синий шар,");
    }

    public void donttake(){
        if (isSmallperson()){
            System.out.println("но этот "+name + " его не взял, потому что сам он был еще такой маленький, что его не взяли в гости,");
        }
        else{
            System.out.println("этот "+name + " его взял.");
            System.exit(0);
        }
    }

    @Override
    public String getName(){
        return name;
    }
    @Override
    public DirectionType getType(){
        return TYPE;
    }
    @Override
    public String toString() {
        return name;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof rodiznakkrolika) {
            return name.equals(((rodiznakkrolika) obj).getName()) && isSmallperson() == ((rodiznakkrolika) obj).isSmallperson();
        }
        return false;
    }
    @Override
    public int hashCode() {
        if (isSmallperson()) return name.hashCode() + name.length();
        return name.hashCode();
    }
}
