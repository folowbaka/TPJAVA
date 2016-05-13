
public abstract class Robot {

	protected int posx;
	protected int posy;
	protected Monde m;
	
	public Robot(int x,int y,Monde m)
	{
		this.posx=x;
		this.posy=y;
		this.m=m;
	}
	public Robot(Monde m)
	{
		this.m=m;
		this.posx=(int)(Math.random()*(this.m.getNBC()));
		this.posy=(int)(Math.random()*(this.m.getNBL()));
	}
	public void vaEn(int i,int j)
	{
		this.posx=i;
		this.posy=j;
	}
	public abstract void parcourir();
}
