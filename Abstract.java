package Tasks;
abstract class Shape
{
	abstract double area();//abstract method

void displayShapeType()//non abstract
{
	System.out.println("the cirecle and rectangle");
}
}
class Circle extends Shape
{
	private double radius;
Circle()
{
	this.radius=456;
}
public double area(){
	return Math.PI*radius*radius;	
}
}
class Rectangle extends Shape
{double len;
double width;
Rectangle(){
	this.len=10;
	this.width=20;
} 
public double area() {
	return len*width;
}
	}
public class Abstract {
	public static void main(String[] args) {
		Shape obj = new Circle();
        Shape obj2 = new Rectangle();
        System.out.println("Circle area:"+ obj.area());
        System.out.println("Rectangle area:"+obj2.area());
        obj
        .displayShapeType();
    }
	}