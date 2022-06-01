package objectorientedprogramming;

abstract class AbstractDemo {
	
	public AbstractDemo() {
		System.out.println("AbstractDemo class constructor is calling");
	}
	
	public void showMyData() {
		System.out.println("showMyData is calling");
	}
	
	public abstract void showMyFullData();
}

interface IPrinter {
	//declare fields(by default => public static final keywords)
	int max = 60;
	//declare abstract methods
	void printMyDoc(String stringDoc);
	void printMyFullName(String firstName, String lastName);
	//default method
	public default int getInformation() {
		return 5;
	}
	
	//static mod
	public static int getOtherInformation() {
		return 10;
	}
}

interface IDemo {
	
}

interface IShowMyDetails extends IPrinter, IDemo {
	void printMyFullName(String firstName, String lastName);
	void print();
}

class ShowMyDetailsImpl implements IShowMyDetails {

	@Override
	public void printMyFullName(String firstName, String lastName) {
		System.out.println("My Name is "+firstName+" "+lastName);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printMyDoc(String stringDoc) {
		// TODO Auto-generated method stub
		
	}

	
}

class PrinterImpl extends AbstractDemo implements IPrinter, IShowMyDetails {

	@Override
	public void printMyDoc(String stringDoc) {
		System.out.println("Printing the doc ="+stringDoc);
	}

	@Override
	public void printMyFullName(String firstName, String lastName) {
		System.out.println("My Name is "+firstName+" "+lastName);
	}

	
	public void printMyAddress() {
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void showMyFullData() {
		System.out.println("showMyFullData is calling from PrinterImpl class");
	}
	
//	@Override
//	public int getInformation() {
//		return 20;
//	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		IPrinter printer = new PrinterImpl();
		
		printer.printMyDoc("Shubham...");
		printer.printMyFullName("Shubham", "Chavan");
		System.out.println(printer.getInformation());
		
		System.out.println(IPrinter.getOtherInformation());
		
		IShowMyDetails details = new PrinterImpl();
		details.printMyFullName("Anmol", "Chavan");
		
		AbstractDemo abstractDemo = new PrinterImpl();
		abstractDemo.showMyFullData();
		abstractDemo.showMyData();
		
		System.out.println(IPrinter.max);
	}
}
