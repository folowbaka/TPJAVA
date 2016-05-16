import java.io.*;

public class CopiePaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line =null;
		BufferedReader Bris = null;
		BufferedWriter Bros=null;
		int n=0;
		if(args.length==2)
		{
			try{
				Bris =new BufferedReader(new FileReader(args[0]));
		        Bros =new BufferedWriter (new FileWriter(args[1]));
		
		        while((line=Bris.readLine())!=null)
				{
		        	if(n%2==0)
		        	Bros.write(line);
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
				try
				{
				 if(Bros!=null)
					 Bros.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}

}
