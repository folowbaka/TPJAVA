
public class PollueurSauteur extends RoboPollueur {

	private int deltax;
	public PollueurSauteur(int x,int y,Monde m,int deltax)
	{
		super(x,y,m);
		this.deltax=deltax;
	}
	public PollueurSauteur(Monde m,int deltax)
	{
		super(m);
		this.deltax=deltax;
	}
	public void parcourir()
	{
		this.posy=0;
		for(this.posx=0;this.posx<this.m.getNBL();this.posx++)
		{
			this.posy=(this.posx*this.deltax)%this.m.getNBC();
		}
	}
}
