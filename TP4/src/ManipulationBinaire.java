import java.awt.Point;
import java.io.*;

public class ManipulationBinaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Point[] p=new Point[5];
			for(int i=0;i<5;i++)
			{
				p[i]=new Point(i,i+1);
			}
			try{
				
			DataOutputStream out = new DataOutputStream(new FileOutputStream("sauvegarde.txt"));
			for(int i=0;i<5;i++)
			{
				out.writeDouble(p[i].getX());
				out.writeDouble(p[i].getY());
			}
			}catch (IOException e)
			{
				e.printStackTrace();
			}
			Point[] p2=new Point[5];
			try{
				
				DataInputStream in = new DataInputStream(new FileInputStream("sauvegarde.txt"));
				for(int i=0;i<5;i++)
				{
					p2[i]=new Point((int)in.readDouble(),(int)in.readDouble());
				}
				}catch (IOException e)
				{
					e.printStackTrace();
				}finally
				{
					for(int i=0;i<5;i++)
					{
						System.out.println(p2[i].toString());
					}
				}
		
	}

}
