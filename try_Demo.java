package try_Demo;

public class try_Demo
{

	public static void main(String[] args)
	{
		try
		{
			int a[]=new int[5];	
			a[7]=22;
		}
		catch (ArithmeticException ex)
		{
			System.out.println("arithmeticException caught");
		}
		catch(NullPointerException n)
		{
			System.out.println("NullPointerEception caught");
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("ArrayIndexOutOfBoundxEception caught");
		}
		catch(Exception exc)
		{
			System.out.println("Handled Eception");
		}
		System.out.println("Rest of the code...");
	}

}
