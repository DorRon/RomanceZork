//Scene 1 for A Jaunt Through Romance 

import cs1.Keyboard;

public class scene1{
    private int dumbScore;
    private int smartScore;
    private int quietScore;
    private int freakScore;
    public int getScore(){
        return dumbScore;
        }
    public int[] scene(String name){
        int[] ret=new int[4];
        System.out.println("Brrrriiinnggg!\n It's the first day of college. Time to wake up.\n");
        while (true){
            System.out.println("You're getting prepared for classes. Do you put on cologne[y/n]?\n");
            String s = Keyboard.readString();
            if (s.equals("y")){
                dumbScore += 1;
                smartScore += 1;
                quietScore += 1;
                freakScore += 1;
                break;
            } else if (s.equals("n")){
                dumbScore -= 1;
                smartScore -= 1;
                quietScore -= 1;
                freakScore -= 1;
                break;
            }       
        }
        System.out.println("You arrive to class 2 minutes early, there are four girls who capture your attention\n");
        System.out.println("1) A girl with frizzy and wavy hair. She's wearing a bright pink tank top and tight shorts. And, you notice, she has red lipstick and black eyeliner on.\n");
        System.out.println("2) )
        System.out.println
        return ret;     
    }
    public static void main(String[] args){
        scene1 try1=new scene1();
        try1.scene("yo"); 
}   
 }
