package person;

import utility.*;

public class rodiznakkrolika extends Person{
    public rodiznakkrolika(){
        super("Родные и Знакомые Кролики", true,true);
        addBalloon(new Balloon("BLUE", "BIG"));
        joinStory();
        join();

    }

    private void join(){
        System.out.println("одному из" +getName()+"приготовили " + getBalloonsSize() +" "+ getBalloonsNames() +" шар,");
    }

    public void donTTake() throws SizePersonException{
        if (atTheParty){
            if (smallPerson) {
                try{
                    if(getBalloonsSize() == "маленький"){
                        System.out.println(6/0);
                    }
                    System.out.println("но этот" + getName() + "его не взял, потому что сам он был еще такой маленький, что его не взяли в гости,");
                }
                catch (Exception e){
                    System.out.println("этот" + getName() + "его взял.");
                    System.exit(0);
                }
            }
            else {
                System.out.println("этот" + getName() + "его взял.");
                throw new SizePersonException("Oн очень доволен полученным шариком.");
            }
        }
        else{
            if (smallPerson) {
                System.out.println("но этот" + getName() + "его не взял, потому что сам он был еще такой маленький, что он не пришел на вечеринку,");
            } else {
                System.out.println("этот" + getName() + "его не взял, потому что он не пришел на вечеринку,");
            }
        }
    }
}
