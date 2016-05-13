
class RobotNettoyeur  extends Robot{
	
	public RobotNettoyeur(int x,int y,Monde m)
	{
		super(x,y,m);
	}
	public RobotNettoyeur(Monde m)
	{
		super(m);
	}
	public void nettoyer()
	{
		this.m.prendPapierGras(this.posx, this.posy);
	}
	public void parcourir()
	{
		this.posx=0;
		this.posy=0;
		
		for(this.posx=0;this.posx<this.m.getNBL();this.posx++)
		{
			if(this.posx%2==0)
			{
				for(this.posy=0;this.posy<this.m.getNBC();this.posy++)
				{
					nettoyer();
				}
			}
			else
				
			{
				for(this.posy=(this.m.getNBC()-1);this.posy>=0;this.posy--)
				{
					nettoyer();
				}
			}
		}
	}

}
