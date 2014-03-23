//Scene 1 for A Jaunt Through Romance 

import cs1.Keyboard;

public class scene1{
    private int dumbScore = 15;
    private int smartScore = 15;
    private int freakScore = 15;
    private String girlName;
    public int[] scene(String name){
        int[] ret=new int[3];
        System.out.println("Brrrriiinnggg!\n It's the first day of college. Time to wake up.\n");
        while (true){
            System.out.println("You're getting prepared for classes. Do you put on cologne[y/n]?\n");
            String s = Keyboard.readString();
            if (s.equals("y")){
                dumbScore += 1;
                smartScore += 1;
                freakScore += 1;
                break;
            } else if (s.equals("n")){
                dumbScore -= 1;
                smartScore -= 1;
                freakScore -= 1;
                break;
            }       
        }
        System.out.println("You arrive to class 2 minutes early, there are three girls who capture your attention\n");
        System.out.println("1) A girl with frizzy and wavy hair. She's wearing a bright pink tank top and tight shorts. And, you notice, she has red lipstick and black eyeliner on. She seems very gregarious and amicable, maybe even too much. \n");
        System.out.println("2) A girl with short hair up until her shoulders. She's somewhat raggy overused clothes. You notice she has a little acne and a pair of glasses. Perhaps she cares more about her studies than her appearence.");
        System.out.println("3) A girl wearing all black slightly torn clothes. she shaved only one side of her hair and the other is blonde and curly. You notice her flamboyant black lipstick. You can't miss her, she's the center of attention, but is it in a good way?");
        while (true){
            System.out.println("You have the option to approach one of the girls before class begins. [enter 1-3 to choose which girl to approach]");
            int t = Keyboard.readInt();
            if (t == 1){
                 System.out.println("Oh hello, how are you?\n");
                 String r = Keyboard.readString();
                 System.out.println("Cool! I'm alright too. My name is Ashley, nice to meet you.\n *Bell Goes off, class is starting*");
                 dumbScore += 1;
                 girlName = "Ashley";
                 break;
            } else if (t == 2){
                System.out.println("Hello, do I know you?");
                String r = Keyboard.readString();
                System.out.println("Oh alright, my name is Patty, pleasure to meet you.\n *Bell Goes off, class is starting*");
                smartScore += 1;
                girlName = "Patty";
                break;
            } else if (t == 3) {
                System.out.println("Hey, what's up?");
                String r = Keyboard.readString();
                System.out.println("Nice, I'm Gabbi by the way. *Bell Goes off, class is starting*");
                freakScore +=1;
                girlName = "Gabbi";
                break;
            }  
        }
        while(true){
            System.out.println("You enter the classroom. You have the possibility to sit next to " + girlName + " .\n Do you sit next to her? [y/n]");
            String r = Keyboard.readString();
                if (r.equals("y") && girlName.equals("Ashley")){
                    dumbScore +=1;
                    break;
                } else if (r.equals("y") && girlName.equals("Patty")){
                    smartScore +=1;
                    break;
                } else if (r.equals("y") && girlName.equals("Gabbi")){
                    freakScore += 1;
                    break;
                }
        }
        while (true){
            System.out.println(girlName + " is look very cute, you can't help but look at her. By the end of class you want to obtain her number. Do you build up the courage to ask her?[y/n]");
            String r = Keyboard.readString();
            if (r.equals("y") && dumbScore == 18){
                System.out.println("Ya sure, it's 987-654-3210, text me sometime.");
                break;
            } else if (r.equals("y") && smartScore < 19){
                System.out.println("Sorry not yet, I don't know you well enough.");
                smartScore -= 1;
                break;
            } else if (r.equals("y") && freakScore == 18){
                System.out.println("Um ya why not? It's 987-654-3210.");
                break;
            } else if (r.equals("n")){
                System.out.println("You leave your first day at college alone, and silently return to your home.");
                break;
            }
            
        }
        ret[0]=dumbScore;
        ret[1]=smartScore;
        ret[2]=freakScore;
    }
    public static void main(String[] args){
        scene1 try1=new scene1();
        try1.scene("yo"); 
}   
 }
