
public class TasEntiers extends Tas {

	public TasEntiers(int capacite)
	{
		super(capacite);
	}
	boolean plusGrand(Object o1,Object o2)
	{
		if (((Integer)o1).intValue()>((Integer)o2).intValue())
			return true;
		return false;
	}
	
}
