import java.io.*;

public class Copie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0;
		BufferedInputStream fis=null;
		BufferedOutputStream fos=null;
		if(args.length==2)
		{
			try{
				fis =new BufferedInputStream(new FileInputStream(new File(args[0])));
		        fos =new BufferedOutputStream (new FileOutputStream(new File(args[1])));
		        byte[] buf=new byte[8000];
		
		        while(fis.read(buf)!=0)
				{
		        	fos.write(buf);
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
					if(fis!=null)
					 fis.close();
				}catch(IOException e)
				{
					e.printStackTrace();
				}
				try
				{
				 if(fos!=null)
					 fos.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
		else
		{
			
		}
		try{
			Reader in = new InputStreamReader(System.in);
			do
			{
				c=in.read();
				if(c!=1)
				{
					System.out.println((char)c); 
				}
			}while(c!=-1);
		}catch(IOException e){
			System.err.print(e.getMessage());
			System.exit(2);
		}
	}

}
