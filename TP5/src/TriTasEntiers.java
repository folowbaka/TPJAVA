
public class TriTasEntiers {
	private int tri;
	public TriTasEntiers(int tri)
	{
		this.tri=tri;
	}
	
	int[] TriTableau(int[] tab,int typetri)
	{
		int tabtri[]=new int[tab.length];
		TasEntiers te=new TasEntiers(tab.length);
		for(int i=0;i<tab.length;i++)
		{
			te.ajouter(tab[i]);
		}
		if(typetri==1)
		{
			for(int i=0;i<tab.length;i++)
			{
				tabtri[i]=((Integer)te.retirer()).intValue();
			}
		
		}
		else if(typetri==2)
		{
			for(int i=tab.length-1;i>=0;i--)
			{
				tabtri[i]=((Integer)te.retirer()).intValue();
			}
		}
		return tabtri;
	}
}
