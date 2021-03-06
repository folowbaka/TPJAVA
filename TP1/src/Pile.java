
public class Pile {

		private int taillePile;
		private ElementPile tete;
		private ElementPile queue;
		
		public Pile()
		{
			this.taillePile=0;
			this.tete=null;
			this.queue=null;
			
		}
		public void setTete(ElementPile tete)
		{
			this.tete=tete;
		}
		public void setQueue(ElementPile queue)
		{
			this.queue=queue;
		}
		public void setTaillePile(int taillePile)
		{
			this.taillePile=taillePile;
		}
		public int getTaillePile()
		{
			return this.taillePile;
		}
		public ElementPile getQueue()
		{
			return this.queue;
		}
		public ElementPile getTete()
		{
			return this.tete;
		}
		public int getEntierSommet()
		{
			return this.getTete().getEntier();
		}
		public boolean isEmpty()
		{
			if(taillePile==0 && queue==null && tete==null)
			{
				return true;
			}
			else if(taillePile==0 && (queue!=null || tete!=null))
			{
				System.out.println("Erreur Pile  invalide");
				return false;
			}
			else
			{
				return false;
			}
		}
		public void empile(int entier)
		{
			if(this.isEmpty())
			{
				this.setTete(new ElementPile(entier));
				this.setQueue(this.tete);
			}
			else
			{
				this.tete.setEpsuivant(new ElementPile(entier));
				this.tete=this.tete.getEpsuivant();
			}
			this.setTaillePile(this.getTaillePile()+1);
		}
		public int depile()
		{
			int entierSommet;
			if(this.isEmpty())
			{
				System.out.println("Dépilement impossible,Pile vide");
				return 0;
			}
			else if(this.getTaillePile()==1)
			{
				entierSommet=this.getTete().getEntier();
				this.setTete(null);
				this.setQueue(null);
			}
			else
			{
				ElementPile actuel=this.getQueue();
				int i=1;
				while(actuel.getEpsuivant()!=null && actuel.getEpsuivant().getEpsuivant()!=null && i<=this.getTaillePile())
				{
					i++;
					actuel=actuel.getEpsuivant();
				}
				this.setTete(actuel);
				entierSommet=this.getTete().getEpsuivant().getEntier();
				this.getTete().setEpsuivant(null);
			}
			this.setTaillePile(this.getTaillePile()-1);
			return entierSommet;
		}
		public String toString()
		{
			String s="";
			ElementPile actuel=this.getQueue();
			if(this.isEmpty())
			{
				s="Pile vide";
			}
			else
			{
				int i=1;
				while(actuel.getEpsuivant()!=null && i<this.getTaillePile())
				{
					s=s+"ElementPile "+i+" : "+actuel.getEntier()+"\n";
					i++;
					actuel=actuel.getEpsuivant();
				}
				s=s+"ElementPile "+i+" : "+actuel.getEntier()+"\n";
			}
			return s;
		}
}
