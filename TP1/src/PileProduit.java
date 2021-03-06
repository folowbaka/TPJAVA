import java.util.Scanner;

public  class PileProduit {
	
		private int taillePile;
		private Produit tete;
		private Produit queue;
		
		public PileProduit()
		{
			this.taillePile=0;
			this.tete=null;
			this.queue=null;
			
		}
		public void construitEntrepot()
		{
			boolean ajouter=false;
			Scanner sc=new Scanner(System.in);
			do
			{
				ajouter=false;
				String ajou="";
				String nom="";
				int prix=0;
				int jours=0;
				System.out.println("Entrez le nom du produit");
				nom=sc.next();
				System.out.println("Entrez le prix du produit");
				prix=sc.nextInt();
				System.out.println("Entrez le nombre de jours avant péremption du produit");
				jours=sc.nextInt();
				this.empile(new Produit(nom,prix,jours));
				System.out.println("Voulez vous ajouter un autre produit?(y/n)");
				ajou=sc.next();
				ajouter=ajou.equals("y");
			}while(ajouter);
			
		}
		public void setTete(Produit tete)
		{
			this.tete=tete;
		}
		public void setQueue(Produit queue)
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
		public Produit getQueue()
		{
			return this.queue;
		}
		public Produit getTete()
		{
			return this.tete;
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
		public void empile(Produit p)
		{
			if(this.isEmpty())
			{
				this.setTete(new Produit(p));
				this.setQueue(this.tete);
			}
			else
			{
				this.tete.setProduitSuivant(new Produit(p));
				this.tete=this.tete.getProduitSuivant();
			}
			this.setTaillePile(this.getTaillePile()+1);
		}
		public Produit depile()
		{
			Produit p=null;
			if(this.isEmpty())
			{
				System.out.println("Dépilement impossible,Pile vide");
				return null;
			}
			else if(this.getTaillePile()==1)
			{
				p=this.getTete();
				this.setTete(null);
				this.setQueue(null);
			}
			else
			{
				Produit actuel=this.getQueue();
				int i=1;
				while(actuel.getProduitSuivant()!=null && actuel.getProduitSuivant().getProduitSuivant()!=null && i<=this.getTaillePile())
				{
					i++;
					actuel=actuel.getProduitSuivant();
				}
				this.setTete(actuel);
				p=this.getTete().getProduitSuivant();
				this.getTete().setProduitSuivant(null);
			}
			this.setTaillePile(this.getTaillePile()-1);
			return p;
		}
		public  void tri()
		{
			PileProduit pb=new PileProduit();
			PileProduit pc=new PileProduit();
			while(!this.isEmpty())
			{
				System.out.println("test");
				if(pb.isEmpty() || this.getTete().getJours()<pb.getTete().getJours())
				{
					pb.empile(this.depile());
						while(!pc.isEmpty())
						{
							pb.empile(pc.depile());
						}
	
				}
				else
				{
					pc.empile(pb.depile());
				}
			}
			this.taillePile=pb.taillePile;
			this.tete=pb.getTete();
			this.queue=pb.getQueue();
		}
		public int suppresion()
		{
			int sommeperdu=0;
			while(this.tete.getJours()<0)
			{
				sommeperdu=this.tete.getPrix();
				this.depile();
			}
			return sommeperdu;
		}
		public static PileProduit union(PileProduit p1,PileProduit p2)
		{
			while(p2.isEmpty())
			{
				p1.empile(p2.depile());
			}
			p1.tri();
			p1.suppresion();
			return p1;
		}
		public static PileProduit instersection(PileProduit p1,PileProduit p2)
		{
			PileProduit p2temp=new PileProduit();
			PileProduit pinterTemp=new PileProduit();
			PileProduit pinter=new PileProduit();
			while(!p1.isEmpty())
			{
				Produit pr=p1.depile();
				while(!p2.getTete().equals(pr))
				{
					p2temp.empile(p2.depile());
					
				}
				while(!pinter.getTete().equals(pr))
				{
					pinterTemp.empile(pinter.depile());
				}
				pinter=pinterTemp;
				if(!p2.isEmpty() && pinter.isEmpty())
				{
					pinter.empile(p2.depile());
				}
				while(!p2temp.isEmpty())
				{
					p2.empile(p2temp.depile());
				}
				
			}
			
			return pinter;
		}
		public String toString()
		{
			String s="";
			Produit actuel=this.getQueue();
			if(this.isEmpty())
			{
				s="Pile vide";
			}
			else
			{
				int i=1;
				while(actuel.getProduitSuivant()!=null && i<this.getTaillePile())
				{
					s=s+"Produit "+i+" : Nom "+actuel.getNom()+", jours avant péremption "+actuel.getJours()+", prix : "+actuel.getPrix() +"\n";
					i++;
					actuel=actuel.getProduitSuivant();
				}
				s=s+"Produit "+i+" : Nom "+actuel.getNom()+", jours avant péremption "+actuel.getJours()+", prix : "+actuel.getPrix() +"\n";
			}
			return s;
		}
}

