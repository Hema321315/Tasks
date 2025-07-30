package tasks2;
class Box<T>     // we use this for giving differnt dsts type canbe used 
{
    private T value;

    public void setValue(T value) 
    {
        this.value = value;
    }

    public T getValue()
    {
        return value;
    }
}
public class Genericclass {

    public static void main(String[] args) {
                                                                    //  autoboxing
        Box<Integer> intobj = new Box<>();
        intobj.setValue(50);  // Autoboxes int to Integer by using intobj is int giving wrapper value
        System.out.println("Integer value: " + intobj.getValue());

                                                             // autoboxing
        Box<Double> doubleobj = new Box<>();
        doubleobj.setValue(56.9);  // Autoboxes double to Double
        System.out.println("Double value: " + doubleobj.getValue());
    }
}
