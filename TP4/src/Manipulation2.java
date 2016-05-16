import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.StreamTokenizer;

public class Manipulation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StreamTokenizer st=null;
		int n=0;
		if(args.length==2)
		{
			try{
				st =new StreamTokenizer(new LineNumberReader(new FileReader(args[0])));
				   int currentToken = st.nextToken();
				      while (currentToken != StreamTokenizer.TT_EOF)
				      {
				        if(args[1].equals(st.sval));
				        	n++;
				        currentToken = st.nextToken();
				      }
				     System.out.println(n);
			}catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}

}
