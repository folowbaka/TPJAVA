
public class UneInterception {

	public static void main(String[] args) throws HorsBornes {
		// TODO Auto-generated method stub
		UneLevee l;
		
		try{
			l=new UneLevee(2);
			l=new UneLevee(4);
		}catch(HorsBornes e)
		{
			
		}
		l=new UneLevee(-1);
	}

}
