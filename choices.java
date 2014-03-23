public class Choices
{
	public static int options(String[] op)
	{	String a = readString();
		while (!Arrays.asList(op).contains(a)) {
			System.out.println("retry");
			a = readString();
		}
		return Arrays.asList(op).indexOf(a);
	}
}
