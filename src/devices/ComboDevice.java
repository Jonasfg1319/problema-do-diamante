package devices;

public class ComboDevice extends Device implements Printer,Scanner {

	public ComboDevice(String serialNumber) {
		super(serialNumber);
		
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Combo process: "+doc);
		
	}

	@Override
	public void scan(String doc) {
		System.out.println("Combo scanner: "+doc);
	}

	@Override
	public void print(String doc) {
		System.out.println("Combo printing: "+doc);
	}

}
