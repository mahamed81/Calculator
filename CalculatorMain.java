import java.util.Scanner;

public class CalculatorMain {


	public static void main(String args[])
	{
	    float a, b, res;
	    char choice, ch;
	    boolean flag = true;
	    Scanner scan = new Scanner(System.in);

	    while(flag) {
	    
	        System.out.print("(1) Addition\n");
	        System.out.print("(2) Subtraction\n");
	        System.out.print("(3) Multiplication\n");
	        System.out.print("(4) Division\n");
	        System.out.print("(5) Exit\n\n");
	        System.out.print("Enter Your Choice : ");
	        choice = scan.next().charAt(0);

	        switch(choice)
	        {
	            case '1' : System.out.print("Enter Two Number : ");
	                a = scan.nextFloat();
	                b = scan.nextFloat();
	                res = a + b;
	   

	                System.out.println("Result = " + res);
	                break;
	            case '2' : System.out.print("Enter Two Number : ");
	                a = scan.nextFloat();
	                b = scan.nextFloat();
	                res = a - b;
	                System.out.println("Result = " + res);
	                break;
	                
	            case '3' : System.out.print("Enter Two Number : ");
	                a = scan.nextFloat();
	                b = scan.nextFloat();
	                res = a * b;
	                System.out.println("Result = " + res);
	                break;
	                
	            case '4' : System.out.print("Enter Two Number : ");
	                a = scan.nextFloat();
	                b = scan.nextFloat();
	                res = a / b;
	                System.out.println("Result = " + res);
	                break;
		           
	            case '5' : flag= false;
	                break;
	            default : System.out.print("Wrong Choice!!!");
	        }
	    }
	}
	}

