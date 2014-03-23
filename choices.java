import java.util.*;
Import cs1.Keyboard.*
public class function
{
	public static int show_message (String mess, String[] options)
	{
		System.out.println(mess);
		for ( String s : options)
		{	int index = Arrays.asList(options).indexOf(s)+1;
			System.out.println(index + ":" +s);
		}
		return Keyboard.readInt();
	}
	
}
