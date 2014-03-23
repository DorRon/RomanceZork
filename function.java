import java.util.*;
import cs1.Keyboard;
public class function
{
	public static int show_message (String mess, String[] options)
	{
		System.out.println(mess);
		for ( String s : options)
		{	int index = Arrays.asList(options).indexOf(s)+1;
			System.out.println(index + ":" +s);
		}
		int choice = Keyboard.readInt();
		while (0 > choice || choice > options.length)
			{
				show_message("invalid choice! please pick again");
				choice = Keyboard.readInt();	
			}
		return choice;
	}
	public static void show_message(String mess)
	{System.out.println(mess);}
       
        public static void show_message(String mess, String speaker)
	{System.out.println(speaker+":"+mess);}
	
}

