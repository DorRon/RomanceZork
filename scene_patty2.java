
import java.util.*;
import java.math.*;
public class scene_patty2 {
		private String _name;
		private int _score;
		public scene_patty2(String name, int score)
		{
			_name = name;
			_score = score;
		};
		public int scene() {
		String[] options2 = {"yes","No"};
		int choice;
		function.show_message("As you walked into your class, you realized that you forgot to bring your hw with you");
		choice = function.show_message("Do you want to ask patty to give you her homework? [yes/No]",options2);
		if (choice == 1)
		
		{
			_score += 1;
			function.nl();
			function.show_message("Hey! Patty :), can I see your homework",_name);
			if ((int)(Math.random()*100) >20)	
				{
					function.show_message("No... you can't","Patty");
					 String[] options3 = {"I hate you", "why?","Okay, but can we be friends"};
					 choice = function.show_message(_name+":",options3);
					 if (choice == 1)
					 {_score -=10; function.show_message("Adios Losarr",_name);}
					 else if (choice == 2)
					 {	options2[0] = "Fair enough, but Can we be friends?";
					  options2[1] = "You are such a loser";
						 
						 choice = function.show_message("Because Ms.Albu is gonna find out. \nand i dont want to get into any trouble",options2);
						if (choice == 1){function.show_message("Yea:) Sure",_name); _score+=20;}
						else{function.show_message("I dont like you >:(","Patty");_score -=10;}}
					else {function.show_message("Yeah Sure","Patty");}	
						}
			else 
				{
					function.show_message("Okay... But don't copy word by word cause then Ms.Albu will know you cheated off of me :)","patty");
					_score += 2;
				}
		}
		else 
			{	function.nl();
				function.show_message("You are honest! that is good!! Too bad you are gonna fail your Apush class");
			}
		return _score;
		}
		
			
		
	
	public static void main(String[] args)
	{ scene_patty2 a = new scene_patty2("Tashi",0);
	  a.scene(); }
	
}
