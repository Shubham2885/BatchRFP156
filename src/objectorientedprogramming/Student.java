package objectorientedprogramming;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

	private String fname;
	private String lname;
	private String mobileNo;
	private Date dob;
	public Student(String fname, String lname, String mobileNo, Date dob) {
		this.fname = fname;
		this.lname = lname;
		this.mobileNo = mobileNo;
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String date = dateFormat.format(dob);
		return "Student [fname=" + fname + ", lname=" + lname + ", mobileNo=" + mobileNo +" dob = "+ date+ "]";
	}
}
