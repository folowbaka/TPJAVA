
public class ElementPile {

	private int entier;
	private ElementPile epsuivant;
	
	public ElementPile()
	{
		this.entier=0;
		this.epsuivant=new ElementPile();
			
	}
	public ElementPile(int entier)
	{
		this.entier=entier;
		this.epsuivant=null;
			
	}
	public void setEntier(int entier)
	{
		this.entier=entier;
	}
	public void setEpsuivant(ElementPile epsuivant)
	{
		this.epsuivant=epsuivant;
	}
	public int getEntier()
	{
		return this.entier;
	}
	public ElementPile getEpsuivant()
	{
		return this.epsuivant;
	}
}