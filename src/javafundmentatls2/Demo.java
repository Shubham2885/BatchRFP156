package javafundmentatls2;

public class Demo {

	public static void main(String[] args) {
		for(byte i = 0;i<100;i++) {
			double val = Math.random();
			int x = (int)(val*100);
			if(x > 9) {
				System.out.println(x);
			}
			if(val > 0.5) {
				System.out.println("Present...");
			}else {
				System.out.println("Absent");
			}
		}
	}
}
