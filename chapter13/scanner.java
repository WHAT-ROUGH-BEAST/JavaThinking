package chapter12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class test1
{
	public static void main(String[] args)
	{
		Test test = new Test("name 1 10.0");
		System.out.println(test);
		
		try
		{
			 File file = new File("C:\\Users\\18069\\Desktop\\test.xml");
				
			Scanner sc = new Scanner(file);
				
			while (sc.hasNext())
			{
				System.out.println(sc.next());
			}
		} 
		catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Test
{
	String str;
	int a;
	double b;
	Scanner scanner;
	public Test(String s)
	{
		scanner = new Scanner(s);
		try
		{
			init();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	private void init() throws IOException
	{
		str = scanner.next();
		a = scanner.nextInt();
		b = scanner.nextDouble();
	}
	
	@Override
	public String toString()
	{
		return String.format("str = %s, a = %d, b = %.2f", this.str, this.a, this.b);
	}
}