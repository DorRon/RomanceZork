import cs1.Keyboard;

public class Driver{
	private String _her;
	private int _score;
	private int[] _scores=new int[4];
	private String _name; 
	private String[] _names={"Ashley","Patty","Julie","Gabbi"};
	private String iso(int[] scores){
		int tmp=-1000000;
		String tmp2;
		for (int i=0;i<scores.length;i++){
			if (scores[i]>tmp){
				tmp=scores[i];
				tmp2=_names[i];
			}
		}
		return tmp2;
	}
	public void run(){
		Intro begin=new Intro();
		_name =begin.start();
		scene1 scene=new scene1();
		_scores=scene.scene(_name);
		_her=iso(_scores);
		scene2 nscene=new scene2(_name,_score);
		_score=nscene.scene();
	}
	public static void main(String [] args){
		Driver game=new Driver();
		game.run();
	}
}

