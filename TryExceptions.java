package Tasks;
import java.util.Scanner;

public class TryExceptions {
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number to divide 100 by: ");

        try {
            int num = sc.nextInt();
            int result = 100 / num;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero not valid");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
        }
finally
{
	System.out.println("end of input");
}


        sc.close();
    }
    }

