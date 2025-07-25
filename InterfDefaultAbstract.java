package Tasks;
interface RemoteControl {
 void turnOn();//default abstract we know that its interface method
 default void batteryStatus() {
     System.out.println("Battery is 50%.");
 }
 static void  info() {
	 System.out.println("theres good info from tv to understand");
 }
}
class TV implements RemoteControl {
	public void turnOn() {
     System.out.println("TV is now playing.");
 }
}
public class InterfDefaultAbstract  {
 public static void main(String[] args) 
 {
     TV obj = new TV();
     obj.turnOn();//abstract
     obj.batteryStatus();
     RemoteControl.info();//static 
 }
}