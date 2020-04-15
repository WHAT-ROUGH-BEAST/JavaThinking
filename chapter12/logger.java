package chapter12;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class test1
{
	public static void main(String[] args)
	{
		try 
		{
			throw new MyException();
		} 
		catch (Exception e) 
		{
			System.out.println("caught " + e);
		}
	}
}

class MyException extends Exception
{
	private static Logger logger = 
			Logger.getLogger("LoggerMyException");
	
	public MyException() 
	{
		StringWriter trace = new StringWriter();
		printStackTrace(new PrintWriter(trace));
		logger.severe(trace.toString());
	}
}