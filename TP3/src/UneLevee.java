
public class UneLevee {
	private int entre0et3=0;
	
	public UneLevee(int param)throws HorsBornes{
		
		if(param<0 || param >3)
			throw new HorsBornes();
		else
		{
			this.entre0et3=param;
		}
	}

}
