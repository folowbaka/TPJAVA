import java.io.*;

public class Manipulation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader Bris=null;
		char[] c=new char[1];
		String contenu="";
		if(args.length==1)
		{
			try{
				Bris=new BufferedReader(new FileReader(args[0]));
				while(Bris.read(c)>=0)
				{
					if((char)c[0]!='\n' && (char)c[0]!=' ' && (char)c[0]!='	')
					contenu=contenu+(char)c[0];
				}
			}catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}catch(IOException e )
			{
				e.printStackTrace();
			}finally{
				try
				{
					System.out.println(contenu);
					
					if(Bris!=null)
						Bris.close();		
				}catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
		else
		{
			System.out.println("Nombre d'arguments invalide");
		}
		
	}

}
