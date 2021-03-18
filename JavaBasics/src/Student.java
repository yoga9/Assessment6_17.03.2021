
public class Student implements Comparable<Student> {
	
		int Rollno;
	    String Name, Dept, Grade;
	
    
	    public Student(int rollno, String name, String dept, String grade) {
		super();
		Rollno = rollno;
		Name = name;
		Dept = dept;
		Grade = grade;
	}

		@Override
		public  int compareTo(Student Stu) {
			// TODO Auto-generated method stub
			
			if(Rollno == Stu.Rollno)
			    return 0;
			else if(Rollno>Stu.Rollno) 
				return 1;
			else return -1;
		}
	   
       
}
