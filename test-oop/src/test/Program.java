package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import test.entity.Student;

public class Program {

	public static void main(String[] args) {
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		Student stud = new Student("Иван", "Иванов", 25);
		stud.passExam("Математика", 4);
		stud.passExam("Физика", 4);
		stud.passExam("Программирование", 5);
		stud.setAge(30);
		list.add(stud);
		
		stud = new Student("Сергей", "Сергеев", 25);
		stud.passExam("Математика", 5);
		stud.passExam("Физика", 5);
		stud.passExam("Программирование", 5);
		list.add(stud);
		
		stud = new Student("Петр", "Петров", 25);
		stud.passExam("Математика", 3);
		stud.passExam("Физика", 3);
		stud.passExam("Программирование", 3);
		list.add(stud);
 
	
		
		Collections.sort(list);
		
		
		for(Student s: list)
			System.out.println(s.toString() + " успеваемость:" + s.averageRate());
		
	}

}


