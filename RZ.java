
/*                                             
                                              Romantic Accord 
*/
import java.util.Scanner;
public class RZ{    
    private int player_score = 15; //init player score in game 
    private String user_name;
    private Scanner sc= new Scanner (System.in);
    public RZ(){}
    public String getName(){
       return user_name;
    }
    public String setName(String s){
        String tmp=user_name;
        user_name=s;
        return tmp;
    }
    public static void main(String[] args){
        RZ game=new RZ();
        String welcomeMessage = "A romance RPG aiming to assist those in possibly upcoming stressful situations.\n"
                         +  "This RPG follows the Zork format, and is solely text-based.\n"
                         +  "You start by answering a questionaire in the first scene,\n"
                         +  "Your decisions will impact the reactions of the partner you choose to pursue throughout the game,\n"
                         +  "and will overall modify the ending in a specific way.\n"
                         +  "For example if you choose to ignore your partner,\n"
                         +  "This may anger her, and lower your chances of success,\n"
                         +  "But it could also make her more eager to get to know you.\n"
                         +  "Make your own calculations and hope for the best.\n"
                         +  "Make the right choices and enjoy the game.";
        System.out.println("\t\t\t***Romantic Accord***\n");
        System.out.println(welcomeMessage);
        System.out.print("Enter your first name here: ");
        game.setName(sc.next());
        System.out.println("Welcome to the Romantic Accord " + user_name + "\n\n");
        scene1.main();
    }

    
}
