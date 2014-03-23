//Scene 3 for Freak alternative

import cs1.Keyboard;
class Scene3F{
    public String _name;
    private int _score;
    public Scene3F(String name, int score){
        _name=name;
        _score=score;
      }
    public int scene(){
        System.out.println("You just woke up from a meaningful dream. You decide to make a possibly life-changing decision today, but you're not quite sure what it is yet.");
        while(true){
        System.out.println("You arrive at school after a casual bus ride, do you sit next to Gabbi again?[y/n]");
        String a = Keyboard.readString();
        if (a.equals("y")){
            System.out.println("Gabbi: Hey neighbor *giggles*, buenos dias. Sorry about last night, I had to do something important.");
            String b = Keyboard.readString();
            System.out.println("Gabbi: It's a secret, I can't tell you, not yet at least. \n*class bell goes off*\n\n*class ends*");
            _score +=1;
            System.out.println("Do you approach Gabbi, and ask her out? [y/n]");
            String c = Keyboard.readString();
            if (c.equals("y") && _score >= 20){
                System.out.println("Gabbi: Oh my gosh, this is pretty sudden, but I'd love to! Is tonight at 8 P.M. good? I know a perfect place, if you wouldn't mind");
                _score += 1;
                break;
            } else if (c.equals("y") && _score < 20) {
                System.out.println("Gabbi: Wow, this is unexpected, I'm sorry but I'm actually busy today, sorry pal.");
                _score -= 1;
                break;
            }
        else if (a.equals("n")) {
            System.out.println("*class bell goes off*\n *1 hour later* \n *class ends*");
            _score -= 1;
            System.out.println("Do you approach Gabbi, and ask her out? [y/n]");
            String e = Keyboard.readString();
            if (e.equals("y") && _score >= 20){
                System.out.println("Gabbi: Oh my gosh, this is pretty sudden, but I'd love to! Is tonight at 8 P.M. good? I know a perfect place, if you wouldn't mind");
                _score += 1;
                break;
            } else if (e.equals("y") && _score < 20){
                System.out.println("Gabbi: Wow, this is unexpected, I'm sorry but I'm actually busy today, sorry pal.");
                _score -= 1;
                break;
            } else if (e.equals("n")){
                System.out.println("Your chances are getting slimmer by the day " + _name + ". I'd recommend making a move soon.");
            }
        }    
        }
        
        } return _score;
    
    } 
    public static void main(String[] args){
    Scene3F try1 = new Scene3F("Dor", 19);
    try1.scene();   
    }
} 
