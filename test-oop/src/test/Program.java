package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import test.entity.Student;

public class Program {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student stud = new Student("����", "������", 25);
		stud.passExam("����������", 4);
		stud.passExam("������", 4);
		stud.passExam("����������������", 5);
		stud.setAge(30);
		list.add(stud);
		
		stud = new Student("������", "�������", 25);
		stud.passExam("����������", 5);
		stud.passExam("������", 5);
		stud.passExam("����������������", 5);
		list.add(stud);
		
		stud = new Student("����", "������", 25);
		stud.passExam("����������", 3);
		stud.passExam("������", 3);
		stud.passExam("����������������", 3);
		list.add(stud);
 
	
		
		Collections.sort(list);
		
		
		for(Student s: list)
			System.out.println(s.toString() + " ������������:" + s.averageRate());
		
	}

}


