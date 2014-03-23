import cs1.Keyboard;

public class Driver{
	private String _her;
	private int _score;
	private int[] _scores=new int[4];
	private String _name; 
	private String[] _names={"Ashley","Patty","Gabbi"};
	private String iso(int[] scores){
		int tmp=-1000000;
		String tmp2="";
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
		if (_her.equals("Ashley")){
			Scene2P pretty=new Scene2P(_name,_score);
			_score=pretty.scene();
		}
		if (_her.equals("Patty")){
			scene_patty2 patty=new scene_patty2(_name,_score);
			_score=patty.scene();
		}
		if (_her.equals("Gabbi")){
			Scene2F f=new Scene2F(_name,_score);
			_score=f.scene();
			Scene3F f2=new Scene3F(_name,_score);
			f2.scene();
		}
	}

	public static void main(String [] args){
		Driver game=new Driver();
		game.run();
		System.out.println("Thanks for playing!");
		
	}
}

