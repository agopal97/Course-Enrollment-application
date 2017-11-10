/**
 * 
 */

/**
 * @author ashwing
 *
 */
public class CourseEnrollTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MylinkedList lL = new MylinkedList();
	    Student student= new Student();
	    
	    lL.addstudent(student);
	    student.setID(1);
	    student.setName("Luiggi");
	    student.setCreditHoursCompleted(115);
	    student.setMajor("Computer science");	
	    
	    Student student2=new Student();
	    lL.addstudent(student2);    
	    student2.setID(2);
	    student2.setName("Mendoza");	 
	    student2.setCreditHoursCompleted(79);
	    student2.setMajor("Chemistry");
	    lL.displayList(lL.studentData);
	    
	    Course c= new Course();
	    c.setCRN(21554678);
	    c.setSemesterOffered("Spring 2018");
	    c.setTitle("Classical Physics 1");
	    c.setClassroom("Science 234");
	    lL.addcourse(c);	    
	    
	    Course c2=new Course();
	    c2.setCRN(44573289);
	    c2.setSemesterOffered("Fall 2019");
	    c2.setTitle("Geology");
	    c2.setClassroom("Science 229");
	    lL.addcourse(c2);
	    
	    
	    Course c3=new Course();
	    c3.setCRN(34421697);
	    c3.setSemesterOffered("Fall 2019");
	    c3.setTitle("Digital Logic");
	    c3.setClassroom("Augsbury 125");
	    lL.addcourse(c3);
	    lL.displayCourseList(lL.courseData);
	}

}
