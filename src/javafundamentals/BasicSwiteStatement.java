package javafundamentals;

import java.util.Scanner;

enum WeekDay {
	MON("Monday"),TUE("Tuesday"),WED("Wed"),THU("Thusday"),FRI("Friday"),SAT("Saturday"),SUN("Sunday");
	
	private String value;
	
	WeekDay(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}

public class BasicSwiteStatement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the weekday ...");
		String str = scanner.next();
		
		WeekDay today = WeekDay.MON;
		
		switch(str) {
		case "MON" : printDay(WeekDay.MON.getValue());
		break;
		case "TUE" : printDay(WeekDay.TUE.getValue());
		break;
		case "WED" : printDay(WeekDay.WED.getValue());
		break;
		case "THU" : printDay(WeekDay.THU.getValue());
		break;
		case "FRI" : printDay(WeekDay.FRI.getValue());
		break;
		case "SAT" : printDay(WeekDay.SAT.getValue());
		break;
		case "SUN" : printDay(WeekDay.SUN.getValue());
		break;
		}
	}
	
	public static void printDay(String weekDay) {
		System.out.println("Today is "+weekDay+"...");
	}
}
