
public class Tas {
	protected int capacite;
	protected int nbDonnees=0;
	protected Object[] tas;
	
	Tas(int capacite)
	{
		this.capacite=capacite;
		tas=new Object[capacite];
	}
	boolean plusGrand(Object o1,Object o2)
	{
		
			return true;
	}
	boolean ajouter(Object obj)
	{
		if(this.nbDonnees==this.tas.length)
		{
			System.out.println("Tas plein\n");
			return false;
		}
		else if(nbDonnees!=0)
		{
			this.tas[this.nbDonnees]=obj;
			int i=this.nbDonnees;
			while(plusGrand(this.tas[i],this.tas[(i-1)/2]) && i<this.nbDonnees)
			{
				Object objTemp=this.tas[i];
				this.tas[i]=this.tas[(i-1)/2];
				this.tas[(i-1)/2]=objTemp;
			}
			this.nbDonnees++;
			return true;
		}
		else
		{
			this.tas[this.nbDonnees]=obj;
			this.nbDonnees++;
			return true;
		}
	}
	Object retirer()
	{
		
		if(this.nbDonnees==0)
		{
			return null;
		}
		Object obj=this.tas[0];
		Object temp=null;
		this.tas[0]=this.tas[this.nbDonnees];
		int i=0;
		while(plusGrand(this.tas[i*2+1],this.tas[i])|| plusGrand(this.tas[i*2+1],this.tas[i]) && i<this.nbDonnees)
		{
			if(plusGrand(this.tas[i*2+1],this.tas[i*2+2]))
			{
				temp=this.tas[i*2+1];
				this.tas[i*2+1]=this.tas[i];
				this.tas[i]=temp;
				i=i*2+1;
			}
			else
			{
				temp=this.tas[i*2+2];
				this.tas[i*2+2]=this.tas[i];
				this.tas[i]=temp;
				i=i*2+2;
			}
			
		}
		this.nbDonnees--;
		return obj;
	}
	void afficher()
	{
		for(int i=0;i<this.nbDonnees;i++)
		{
			System.out.println(this.tas[i]+"\n");
		}
	}
}
