package ExceptionHandling;

import coreJava_Class.ArthimeticOperations;

public class ErrorHandling {

	public static void test() {
		test();
		

	}

	public static void main(String[] args) {
		try {
			//int i=9/0;
			test();
			int i=9/0;
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
		}

		catch (Error e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Bye");
	}

}
