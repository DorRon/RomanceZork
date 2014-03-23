public class Scene3{
	private int[] _scores=new int[4];
	private String _name;
	private int _dumb;
	private int _smart;
	private int _quiet;
	private int _emo;
	private String _topGirl;
	private String[] _names={"Ashley","Patty","Julie","Gabbi"};
	public Scene3(String name,int[] scores){
		_scores=scores;
		_name=name;
		_topGirl=iso(scores);
	}
	private String iso(int[] scores){
		int tmp=-1000000;
		String tmp2;
		_dumb=scores[0];
		_smart=scores[1];
		_quiet=scores[2];
		_emo=scores[3];
		for (int i=0;i<a.length;i++){
			if (a[i]>tmp){
				tmp=a[i];
				tmp2=_names[i];
			}
		}
		return tmp2;
	}


}
