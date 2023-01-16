package Person;

import utility.ThingInterface;

public class Vinnipux implements ThingInterface{
    private String name;
    private boolean lookback;

    public Vinnipux(){
        name = "Винни-Пух";
        lookback = true;
        joinStory();
    }

    public Vinnipux(String name){
        this.name = name;
        lookback = true;
        joinStory();
    }

    public Vinnipux(String name, boolean lookback){
        this.name = name;
        this.lookback = lookback;
        joinStory();
    }

    private void joinStory(){
        System.out.println("('"+name + "' присоединились к истории)");
        System.out.print(name);
        if (lookback){
            System.out.println(" оглянулся,убедившись, чтоникто не подслушивает,");
        }
        else{
            System.out.println(" убедившись, что никто не подслушивает,");
        }
    }

    public void whisper(){
        System.out.println(name + " прижал лапу к губам и сказал страшным шепотом: Ну, а как раз накануне ");
    }

    public boolean isLookback(){
        return lookback;
    }


    @Override
    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj instanceof  Vinnipux){
            return name.equals(((Vinnipux) obj).getName()) && lookback == ((Vinnipux) obj).isLookback();
        }
        return false;
    }

    @Override
    public int hashCode(){
        if (lookback) return name.hashCode()+ name.length();
        return name.hashCode();
    }

}
