package test;

import java.util.ArrayList;

import test.entity.Student;

public class Program {

	public static void main(String[] args) {
		
		Student stud = new Student("����", "������", 25);
//		stud.setFname("������");
		stud.passExam("����������", 4);
		stud.passExam("������", 4);
		stud.passExam("����������������", 5);
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(stud);
 
		for(Student s: list)
			System.out.println(s.toString() + " ������������:" + s.averageRate());
	}

}
