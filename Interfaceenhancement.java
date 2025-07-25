package Tasks;
interface Logger { 
		default void logInfo() 
		{ 
		System.out.println("Default--Log"); 
		} 
		static void logError() 
		{ 
		System.out.println("Static-Error--Log"); 
		}
}
class AppLogger implements Logger{}
public class Interfaceenhancement
{ 
	public static void main(String[] args)
	{ 
		AppLogger obj = new AppLogger(); 
		obj.logInfo(); 
		Logger.logError();  // Static method  SO call with class name
		} 
		} 