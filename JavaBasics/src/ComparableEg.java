//import java.util.Collections;
//import java.util.ArrayList;
import java.util.*;
public class ComparableEg {
     
	

	public static void main(String[] args) { 
		
		ArrayList<Student> s = new ArrayList<Student>();
		
		s.add(new Student(501, " Karnan", "IT", "A"));
		s.add(new Student(508, " Luxmi", "IT", "B"));
		s.add(new Student(500, " Kavitha", "IT", "C"));
		s.add(new Student(505, " Priya", "IT", "C"));
		s.add(new Student(507, " Monisha", "IT", "A"));
		
		Collections.sort(s);
		for(Student s1 : s) {
			System.out.println("StuRollno :" +s1.Rollno+ " " +"StuName :" +s1.Name+ " " +"Department :" +s1.Dept+ " " +"StuGrade :" +s1.Grade);
		}
		
}
}
