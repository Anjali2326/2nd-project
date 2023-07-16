package overriding;

public class Test {
	public static void main(String[] args) {
		
		SBI s=new SBI();
		ICICI c=new ICICI();
		PNB p=new PNB();
		
		System.out.println("SBI RATE of interest....+s.getInterestRate");
		System.out.println("ICICI RATE of interest....+c.getInterestRate");
		System.out.println("PNB RATE of interest....+p.getInterestRate");
	}

}
