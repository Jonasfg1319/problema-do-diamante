package devices;

public class ComboPrinter extends Device implements Printer{

	public ComboPrinter(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void print(String doc) {
		System.out.println("Process printing 2.2: "+ doc);
		
	}

	@Override
	public void processDoc(String doc) {
		// TODO Auto-generated method stub
		
	}

}
