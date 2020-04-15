package chapter12;

public class test2
{
	public static void main(String[] args)
	{
		Test test = new Test();
		test.f();
	}
}

class Test
{
	public void g()
	{
		throw new TestException("happened in f()");
	}
	
	public void f()
	{
		g();
	}
}

class ErrorException extends Exception
{
	public ErrorException(String str)
	{
		super(str);
	}
}

class TestException extends RuntimeException
{
	public TestException(String str)
	{
		super(str);
	}
}