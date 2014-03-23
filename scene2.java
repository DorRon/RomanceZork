import java.util.Scanner;
class scene2
{
	private int[] _scores =  new int[4];
	private int dumbScore,smartScore,quietScore,freakScore;
	public void scene(String name, int[] scores)
	{
		_scores = scores;
	}	
	scene2( int[] scores)
	{
		dumbScore = scores[0];
		smartScore = scores[1];
		quietScore = scores[2];
		freakScore = scores [3];
		
	}
}
