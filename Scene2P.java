import cs1.Keyboard;
public class Scene2P{
	private int _score;
	private String _name;
	public Scene2P(String name, int score){
		_name=name;
		_score=score;
	}
	public int scene(){

		System.out.println("You wake up, you look at your clock.  7:15.  Crap, you're already running ten minutes late.");
		while(true){
		System.out.println("Do you take more time to prepare and come class late, or do you leave unprepared in order to make it on time [leave/prepare]?");
		String r = Keyboard.readString();
		if (r.equals("late")){
		    _score +=1;
		    System.out.println("You were irresponsible, and late, and Ashley loves it.  AND you looked good.\n ");   
		} else if(r.equals("early") || r.equals("late")) {
		     System.out.println("Do you want to sit next to Ashley today? [y/n]");
		     String s = Keyboard.readString();
		     if (s.equals("y")){
			System.out.println("Ashley: Good morning " + _name + " how are you doing today? ");
			String t = Keyboard.readString();
			System.out.println("Ashley: \"Hahaha! You're so cute.\"\nShe brushes your arm lightly.  \"Wanna sit here?\"");
			while (true){
				System.out.println("Do you sit next to her [y/n]?)
				s=Keyboard.readString();
				if (s.equals("y")){
					_score++;
					System.out.println("Ashley: \"Awesome! Why don't you call me after school hun?\"")
					break;
				}
				if (s.equals("n")){
					_score--;
					System.out.println("Ashley: \"You suck.\" she says, and sticks her tongue out.")
					break;
				}
			}
			if (_score >= 18){
			    System.out.println("*class ends* \nAshley: \"Don't forget to call me!\")
			    break;
			} else {
			     System.out.println("*class ends* \nAshley: Even though you were a jerk, my number's 987-654-3210. Call me, maybe.");
			     _score--;
			     break;
			}
        	     }
    			} 
		}
	return _score;
}
}
}
