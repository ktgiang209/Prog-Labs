package person;

import utility.Person;

public class Vinnipux extends Person {
    private boolean lookBack;

    public Vinnipux(){
        super("Винни-Пух", false,false);
        lookBack = true;
        joinStory();
    }

    public class join{
        public void climbOut(){
            System.out.print(getName()+"выкарабкался из тернового куста,");
        }
        public void treatment(){
            System.out.println(" вытащил из носа колючки и снова задумался.");
        }
        public void thought(){
            System.out.println("И самым первым делом он подумал о Кристофере Робине.");
        }
    }



    public void goToFriend(){
        System.out.println("Итак,"+ getName()+ "отправился к своему другу Кристоферу Робину,");
    }
    public void lookBack(){
        System.out.print(getName());
        if (lookBack){
            System.out.println(" оглянулся,убедившись, чтоникто не подслушивает,");
        }
        else{
            System.out.println(" убедившись, что никто не подслушивает,");
        }
    }
    public void whisper(){
        System.out.println(getName() + " прижал лапу к губам и сказал страшным шепотом: Ну, а как раз накануне ");
    }
    public void think(){
        System.out.println(getName()+" обхватил голову лапами и задумался "+more("глубоко")+". И вопрос был решен.");
    }

}
