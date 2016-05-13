
public class Monde {

	private int nbL;
	private int nbC;
	private boolean[][] mat;
	
	public Monde()
	{
		this.nbL=10;
		this.nbC=10;
		this.mat=new boolean[10][10];
	}
	public Monde(int nbL,int nbC)
	{
		this.nbC=nbC;
		this.nbL=nbL;
		this.mat=new boolean[this.nbL][this.nbC];
	}
	public void metPapierGras(int i,int j)
	{
		this.mat[i][j]=true;
	}
	public void prendPapierGras(int i,int j)
	{
		this.mat[i][j]=false;
	}
	public boolean estSale(int i,int j)
	{
		return this.mat[i][j];
	}
	public int getNBL()
	{
		return this.nbL;
	}
	public int getNBC()
	{
		return this.nbC;
	}
	public int nbPapiersGras()
	{
		int c=0;
		for(int i=0;i<this.nbL;i++)
		{
			for(int j=0;j<this.nbC;i++)
			{
				if(this.mat[i][j])
					c++;
			}
		}
		return c;
	}
	public String toString()
	{
		String s="";
		for(int i=0;i<this.nbL;i++)
		{
			for(int j=0;j<this.nbC;j++)
			{
				if(this.mat[i][j])
				{
					s=s+"o";
				}
				else
					s=s+".";
			}
			s=s+"\n";
		}
		return s;
	}
}
