package devices;

public class ComboScanner extends Device implements Scanner{

	public ComboScanner(String serialNumber) {
		super(serialNumber);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void scan(String doc) {
		System.out.println("Combo Scanner: "+doc);
		
	}

	@Override
	public void processDoc(String doc) {
		// TODO Auto-generated method stub
		
	}

}
