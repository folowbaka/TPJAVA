import java.io.*;

public class CopiePaireLNR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line =null;
		LineNumberReader lris = null;
		BufferedWriter Bros=null;
		int n=0;
		if(args.length==2)
		{
			try{
				lris =new LineNumberReader(new FileReader(args[0]));
		        Bros =new BufferedWriter (new FileWriter(args[1]));
		
		        while((line=lris.readLine())!=null)
				{
		        	
		        	if(lris.getLineNumber()%2==0)
		        	Bros.write(line);
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
					if(lris!=null)
					 lris.close();
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
