package objectorientedprogramming;

//grant parent
class Bonus {
	
	private double basicBonu;
	
	public Bonus() {
		basicBonu = 20000.0;
	}
	
	protected double assigningBonus() {
		return basicBonu;
	}
}

//parent
class Dept extends Bonus {
	
	protected String typeOfDept;

	public Dept(String typeOfDept) {
		super();
		this.typeOfDept = typeOfDept;
	}
	
	@Override
	protected double assigningBonus() {
		if(typeOfDept == "TL") {
			return super.assigningBonus()*5;
		}else if(typeOfDept == "Dev") {
			return super.assigningBonus()*4;
		}else if(typeOfDept == "QA") {
			return super.assigningBonus()*3;
		}else {
			return super.assigningBonus();
		}
	}
}

//chield
class Emp extends Dept {

	private double salary;
	
	public Emp(String typeOfDept, double salary) {
		super(typeOfDept);
		this.salary = salary;
	}
	
	public void getSalary() {
		System.out.println("Bonus = "+assigningBonus());
		System.out.println("Salary = "+salary);
		System.out.println("Tolat Amount = "+(assigningBonus()+salary));
	}
	
}

public class EmpAndDepDemo {

	public static void main(String[] args) {
		
		Emp emp1 = new Emp("TL", 80000.0);
		emp1.getSalary();
		
		Emp emp2 = new Emp("Dev", 60000.0);
		emp2.getSalary();
	}
}
