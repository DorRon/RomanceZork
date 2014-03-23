
/*                                             
                                              Romantic Accord 
*/
import cs1.Keyboard.*;
public class Intro{    
    private int _score = 15; //init player score in game 
    private String _name;
    private String final WELCOME = "A romance RPG aiming to assist those in possibly upcoming stressful situations.\n"
                         +  "This RPG follows the Zork format, and is solely text-based.\n"
                         +  "You start by answering a questionaire in the first scene,\n"
                         +  "Your decisions will impact the reactions of the partner you choose to pursue throughout the game,\n"
                         +  "and will overall modify the ending in a specific way.\n"
                         +  "For example if you choose to ignore your partner,\n"
                         +  "This may anger her, and lower your chances of success,\n"
                         +  "But it could also make her more eager to get to know you.\n"
                         +  "Make your own calculations and hope for the best.\n"
                         +  "Make the right choices and enjoy the game.";
    public Intro(){}
    public String getName(){
       return _name;
    }
    public String setName(String s){
        String tmp=user_name;
        _name=s;
        return tmp;
    }
    public void start (){
        System.out.println("\t\t\t***A Jaunt Through Romance***\n");
        System.out.println(WELCOME);
        System.out.print("Enter your first name here: ");
        _name=readString();
        System.out.println("Welcome to the Romantic Accord " + _name + "\n\n");
    }

    
}
