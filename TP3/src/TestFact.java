
public class TestFact {
	public static void main(String[] args)
	{
		int n;
		try{
         n=Integer.parseInt(args[0]);
         if(n<0)
         {
        	 throw new ExtinctionNeg();
         }
		}
		catch(NumberFormatException e){
			System.out.println("Format de l'argument non correcte");
			n=0;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Aucun argument");
			n=0;
		}
		catch(ExtinctionNeg e)
		{
			n=0;
		}
		if(n==0)
			System.out.println("The factorial of"+n+"is +1");
		else
		{
			int f=1;
			for(int i=2;i<=n;i++)
				f=f*i;
			System.out.println("The factorial of"+n+"is"+f);
		}
	}
}
