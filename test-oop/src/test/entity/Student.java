package test.entity;

import java.util.ArrayList;

public class Student implements Comparable<Student> 
{
	protected String fname;
	protected String sname;
	protected int age;
	
	protected ArrayList<Rating> rates;
	
	public Student(String fname, String sname, int age)  
	{
		super();
		this.fname = fname;
		this.sname = sname;
		this.age = age;
		
		rates = new ArrayList<Rating>(); 
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void passExam(String PredmetName, int rate)
	{
		rates.add( new Rating(PredmetName, rate) );
	}

	@Override
	public String toString() {
		return "Student [fname=" + fname + ", sname=" + sname + ", age=" + age + "]";
	}
		
	public double averageRate()
	{
		int S = 0;
		for(Rating r: rates)
			S += r.getRating();
		return (double)S / rates.size(); 
		
	}


	@Override
	public int compareTo(Student o) {
		double r1 = this.averageRate();
		double r2 = o.averageRate();		
		if ( r1 > r2 ) return 1;
		else if ( r1 == r2 ) return 0;
		else return -1;
	}
	
		
	
	
	
}
