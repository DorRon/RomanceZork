import java.util.Scanner;
public class Choices
{
	public static int options(String[] op)
	{	String a = Main.sc.nextLine();
		while (!Arrays.asList(op).contains(a)) {
			System.out.println("retry");
			a = Main.sc.nextLine();
		}
		return Arrays.asList(op).indexOf(a);
	}
}
