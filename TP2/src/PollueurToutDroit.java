
public class PollueurToutDroit extends RoboPollueur{

	
	public PollueurToutDroit(int x,int y,Monde m)
	{
		super(x,y,m);
		this.posx=0;
	}
	public PollueurToutDroit(Monde m)
	{
		super(m);
		this.posx=0;
	}
	public void parcourir()
	{
		for(this.posx=0;this.posx<this.m.getNBL();this.posx++)
		{

			polluer();
		}
	}
}
