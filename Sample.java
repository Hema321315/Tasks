package Tasks;

public class Sample 
{
	public static void main(String[] args) {

//		Sample4 S=new Sample4();
//		S.setid(16);
//		S.setname("hemasree");
//		System.out.println(S.getid());
//		System.out.println(S.getname());
//		System.out.println(S);
//		}
			BankAccount BA=new BankAccount("ABHG",234);
			System.out.println(BA.getAccountNumber());
			BA.withdraw(200);
	     	BA.deposit(500);
	     	System.out.println(BA.getBalance());
	}
}

