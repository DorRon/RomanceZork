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
    System.out.println("Your alarm clock wakes you up at 7:15, 10 minutes later than you should've woken up.");
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
                    break;
                } else {
                     System.out.println("*class ends* \nGabbi: You seem like a nice guy, my number's 987-654-3210. Call me sometime.");
                     _score +=1;
                     break;
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
