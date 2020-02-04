package application;

import devices.ComboDevice;
import devices.ComboPrinter;
import devices.ComboScanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		ComboPrinter p = new ComboPrinter("1001");
		p.processDoc("My letter");
		p.print("123");
		System.out.println();
		
		ComboScanner s = new ComboScanner("1002");
		p.processDoc("My email");
		s.scan("123");
		System.out.println();
		
		
		ComboDevice c = new ComboDevice("1005");
		c.print("My dissertation");
		c.scan("My dissertation");
		c.processDoc("My dissertation");
		
	}

}
