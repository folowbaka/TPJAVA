import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class Manipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader Bris=null;
		int n=0;
		int c;
		if(args.length==1)
		{
			try{
				Bris =new LineNumberReader(new FileReader(args[0]));
		        while((n=Bris.read())!=-1)
				{
		        	n++;
				}
			}catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}catch(IOException e)
			{
				e.printStackTrace();
			}finally{
				try
				{
					if(Bris!=null)
					 Bris.close();
				}catch(IOException e)
				{
					e.printStackTrace();
				}
			}
		}
	}
}
