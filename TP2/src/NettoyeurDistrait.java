
class NettoyeurDistrait extends RobotNettoyeur {
	
	public NettoyeurDistrait(int x,int y,Monde m)
	{
		super(x,y,m);
	}
	public NettoyeurDistrait(Monde m)
	{
		super(m);
	}
	public void parcourir()
	{
		this.posx=0;
		this.posy=0;
		int c=0;
		for(this.posx=0;this.posx<this.m.getNBL();this.posx++)
		{
				if(this.posx%2==0)
				{
					for(this.posy=0;this.posy<this.m.getNBC();this.posy++)
					{
						if(this.m.estSale(this.posx, this.posy))
						{
							if(c%2==0)
							{
								nettoyer();
							}
							c++;
						}
					}
				}
				else
					
				{
					for(this.posy=(this.m.getNBC()-1);this.posy>=0;this.posy--)
					{
						if(this.m.estSale(this.posx, this.posy))
						{
							if(c%2==0)
							{
								nettoyer();
							}
							c++;
						}
					}
				}
		}
	}
}
