
public class TPmain {

	public static void main(String[] args) {
		Pile pa=new Pile();
		Pile pb=new Pile();
		Pile pc=new Pile();
		int tab[]={4,3,2,5,8,2,6,9,3};
		for(int i=0;i<tab.length;i++)
		{
			pa.empile(tab[i]);
		}
		System.out.println(pa);
		TRI tr=new TRI();
		tr.tri(pa, pb, pc);
		System.out.println(tr.getPb());
		PileProduit pp=new PileProduit();
		pp.construitEntrepot();
		System.out.println(pp);
		pp.tri();
		System.out.println(pp);
		System.out.println("Somme perdu "+pp.suppresion());

	}

}
