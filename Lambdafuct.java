package Tasks;
interface Mathoperation
{
	int operate(int a,int b);//Abstract method only one
}

public class Lambdafuct 
{
	public static void main(String[] args)
{
		Mathoperation add=(a,b)->a+b;//lambda fuct
        Mathoperation sub=(a,b)->a-b;
        Mathoperation multi=(a,b)->a*b;
        System.out.println(add.operate(20,10));
	    System.out.println(multi.operate(20,10));
	    System.out.println(sub.operate(20,10));
}

}
