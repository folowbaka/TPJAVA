
public class TRI {

		private Pile pa;
		private Pile pb;
		private Pile pc;
		
		public TRI()
		{
			this.pa=new Pile();
			this.pb=new Pile();
			this.pc=new Pile();
		}
		public void setPa(Pile a)
		{
			this.pa=a;
		}
		public void setPb(Pile b)
		{
			this.pb=b;
		}
		public void setPc(Pile c)
		{
			this.pc=c;
		}
		public Pile getPa()
		{
			return this.pa;
		}
		public Pile getPb()
		{
			return this.pb;
		}
		public Pile getPc()
		{
			return this.pc;
		}
		public  void tri(Pile a,Pile b,Pile c)
		{
			this.setPa(a);
			this.setPb(b);
			this.setPc(c);
			while(!this.getPa().isEmpty())
			{
				System.out.println("test");
				if(this.getPb().isEmpty() || this.getPa().getEntierSommet()<this.getPb().getEntierSommet())
				{
					this.getPb().empile(this.getPa().depile());
						while(!this.pc.isEmpty())
						{
							this.pb.empile(this.pc.depile());
						}
	
				}
				else
				{
					this.pc.empile(this.pb.depile());
				}
			}
		}
		
}
