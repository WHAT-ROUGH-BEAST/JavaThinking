package chapter12;

/**
 * 
 * @author 18069
 * java 的 exception bug，在抛出下一个异常之前，必须处理当前的异常，否则丢失上一个异常
 */
public class test1
{
	public static void main(String[] args)
	{
		try
		{
			try
			{
				throw new RuntimeException("1");
			}
			finally
			{
				throw new RuntimeException("2");
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
