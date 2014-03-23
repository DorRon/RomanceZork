//Scene 1 for Romantic Accord
public class scene1{
    public String response;
    
    public scene1(){}
    public static void main(){
        System.out.println("So " + RZ.user_name + " you're in an expensive Italian restaurant, on a date with your dream girl.\n");
        System.out.println("You're eating Fettuccini Alfredo and she's eating Gnocchi.\n");
        System.out.println("She accidently drops drops her fork, and stains her dress.\n");

        while (true){
            System.out.println("Do you help her clean her clean up (type help), or do do nothing (type stay)");
            response = RZ.sc.next();
                if (response.equals("help")){
                   RZ.player_score += 1;
                   System.out.println("Thank you " + RZ.user_name);
                   break; 
               }else if(response.equals("stay")) {
                   RZ.player_score -= 1;
                   break;
               }
             }
          
        System.out.println(RZ.player_score);
        
    }
}
