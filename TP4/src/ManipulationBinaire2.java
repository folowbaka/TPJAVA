import java.awt.Point;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ManipulationBinaire2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point[] p=new Point[5];
		for(int i=0;i<5;i++)
		{
			p[i]=new Point(i,i+1);
		}
		try{
			
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("sauvegarde.txt"));
		for(int i=0;i<5;i++)
		{
			out.writeObject(p[i]);
		}
		}catch (IOException e)
		{
			e.printStackTrace();
		}
		Point[] p2=new Point[5];
		try{
			
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("sauvegarde.txt"));
			for(int i=0;i<5;i++)
			{
				p2[i]=(Point)in.readObject();
			}
			}catch (IOException e)
			{
				e.printStackTrace();
			}catch(ClassNotFoundException e)
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
