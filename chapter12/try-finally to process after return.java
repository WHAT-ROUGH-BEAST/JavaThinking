package chapter12;

/**
 * 
 * @author 18069
 * try finally完成多个返回节点，最终仍然执行清理等
 */
public class test1
{
	public static void main(String[] args)
	{
		int a = 1;
		try
		{
			switch (a)
			{
			case 1:
				System.out.println("1");
				return;
			case 2:
				System.out.println("2");
				return;
			}
		}
		finally
		{
			System.out.println("clean");
		}
	}
}
