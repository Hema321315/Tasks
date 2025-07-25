package Tasks;
public class Employe
{
	static int count=10;
	 static int add()
	{
		count++;
		System.out.println(count);
		return 1;
	}
	public static void main(String[] args) 
	{
		System.out.println(Employe.add());
		System.out.println(Employe.add());
//		System.out.println(E3.add());
//		System.out.println(E4.add());
	}
}
