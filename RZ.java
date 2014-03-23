/*                                             
                                              Romantic Accord 
*/
import java.util.Scanner;
public class RZ{    
    public int player_score = 15; //init player score in game 
    public static String user_name;
    public static void main(String[] args){
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
        getName();
        scene1.main();
    }
    public static void getName(){
        Scanner player_name = new Scanner(System.in);
        System.out.print("Enter your first name here: ");
        user_name = player_name.next();
        System.out.println("Welcome to the Romantic Accord " + user_name + "\n\n");
    }
    
}
