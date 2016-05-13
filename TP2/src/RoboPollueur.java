
public abstract class RoboPollueur extends Robot {

	public RoboPollueur(int x,int y,Monde m)
	{
		super(x,y,m);
	}
	public RoboPollueur(Monde m)
	{
		super(m);
	}
	public void polluer()
	{
		this.m.metPapierGras(this.posy,this.posx );
	}
}
