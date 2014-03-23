//Scene 2 Freak alternative

import cs1.Keyboard;
class Scene2F{
    public String _name;
    private int _score;
    public Scene2F(String name, int score){
        _name=name;
        _score=score;
      }
public int scene(){
    System.out.println("Your alarm clock wakes you up at 7:15, 10 minutes later then you should've woken up.");
    while(true){
        System.out.println("Do you take more time to prepare and come class late, or do you leave unprepared in order to make it on time [late/early]?");
        String r = Keyboard.readString();
        if (r.equals("late")){
            _score -=1;
            System.out.println("You were irresponsible, and as a result, you didn't get to speak to Gabbi today. Her initial impression of you might have changed for the worst. Perhaps you should contact her at a given opportunity.");
            break;   
        } else if(r.equals("early")) {
             System.out.println("Do you want to sit next to Gabbi today? [y/n]");
             String s = Keyboard.readString();
             if (s.equals("y")){
                System.out.println("Gabbi: Good morning " + _name + " how are you doing today? ");
                String t = Keyboard.readString();
                System.out.println(" Gabbi: That's nice, I'm actually have decent morning so far. *class bell goes off* Alright we'll talk after class.");
                if (_score == 18){
                    System.out.println("*class ends* \nGabbi: You have my number right, call me after school.");
                    _score += 1;
                    //Call or not query
                    System.out.println("Do you wish to call Gabbi? [y/n]");
                    String q = Keyboard.readString();
                    if (q.equals("y")){
                        System.out.println("*ring ring*\n Oh hey " + _name + ", What's up?");
                        String c = Keyboard.readString();
                        System.out.println("So what are you doing now? I'm listening to some death metal music I guess?");
                        String b = Keyboard.readString(); 
                        System.out.println("Alright listen, I'm glad you called, I really have to go take care of some business alright? Hopefully I'll see you tomorrow. Good Night.");
                        _score += 2;
                        break;
                    } else if(q.equals("n")){
                        _score -=2;
                        break;
                    }
                    
                } else {
                     System.out.println("*class ends* \nGabbi: You seem like a nice guy, my number's 987-654-3210. Call me sometime.");
                     _score +=1;
                     System.out.println("Do you wish to call Gabbi? [y/n]");
                     String d = Keyboard.readString();
                     if (d.equals("y")){
                        System.out.println("*ring ring*\n Oh hey " + _name + ", What's up?");
                        String c = Keyboard.readString();
                        System.out.println("So what are you doing now? I'm listening to some death metal music I guess?");
                        String b = Keyboard.readString(); 
                        System.out.println("Alright listen, I'm glad you called, I really have to go take care of some business alright? Hopefully I'll see you tomorrow. Good Night.");
                        _score += 2;
                        break;
                     } else if (d.equals("n")){
                        _score -=2;
                        break; 
                     }
                }
             }
        }
    } return _score;
  }
  public static void main(String[] args){
    Scene2F try1 = new Scene2F("Dor", 17);
    try1.scene();
  }
}
