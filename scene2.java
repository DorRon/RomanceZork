import java.util.Scanner;
public class scene2
{
	private int[] _scores =  new int[4];
	private String _name;
	private int dumbScore,smartScore,quietScore,freakScore,hScore;
	public void scene(String name, int[] scores)
	{
		switch (hScore)
		{
			case 0 : System.out.print("dumb"); break;
			case 1 : System.out.print("smart"); break;
			case 2 : System.out.print("freak"); break;
			case 3 : System.out.print("quiet"); break;
			
		}
		
	}	
	public scene2(String name, int[] scores)
	{
		_scores =scores;
		_name = name;
		dumbScore = scores[0];
		smartScore = scores[1];
		quietScore = scores[2];
		freakScore = scores [3];
	}
}
