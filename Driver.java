import cs1.Keyboard;

public class Driver{
	private int _dumb;
	private int _smart;
	private int _quiet;
	private int _emo;
	private int[] _scores=new int[4];
	private String _name; 
	public void run(){
		Intro begin=new Intro();
		_name =begin.start();
		scene1 scene=new scene1();
		_scores=scene.scene(_name);
		scene2 nscene=new scene2(_name,_scores);
		_scores=nscene.scene();
	}
	public static void main(String [] args){
		Driver game=new Driver();
		game.run();
	}
}

