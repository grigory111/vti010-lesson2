package test;

import java.util.ArrayList;

import test.entity.Student;

public class Program {

	public static void main(String[] args) {
		
		Student stud = new Student("Иван", "Иванов", 25);
//		stud.setFname("Сергей");
		stud.passExam("Математика", 4);
		stud.passExam("Физика", 4);
		stud.passExam("Программирование", 5);
		
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(stud);
 
		for(Student s: list)
			System.out.println(s.toString() + " успеваемость:" + s.averageRate());
	}

}
