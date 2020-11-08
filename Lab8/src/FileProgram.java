//Author:Shehnaz Khanam Patan
//Date:06/11/2020
import java.io.*;

public class FileProgram {
	public static void main(String args[])
	{
		try
		{
		CopyThread cp=new CopyThread(new FileReader("D://Lav.txt"),new FileWriter("D://target.txt"));//Creating object
		Thread t=new Thread(cp);
		t.start();//By using start we can use threads
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
