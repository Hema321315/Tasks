package Tasks;
class Vehile1{
	String Brand;
	int speed;
	void showdetails(String brand,int speed)
	{
		System.out.println(speed+"   and   "+brand);
	}
}
class Car extends Vehile1
{
	int noofseats=4;
	void show()
	{
	System.out.println("noofseats are    "+noofseats);
}
}
class Bike extends Vehile1
{
	int  noofwheels=2;
	void show2() 
	{
		System.out.println("noofwheels are  "+noofwheels);
	}
}
public class Vehile{
	public static void main(String[] args)
	{
		Car obj=new Car();
		Bike obj1=new Bike();
		obj.showdetails("TATA",100);
		obj.show();
		obj1.showdetails("jupitor", 50);
		obj1.show2();
	}
}
