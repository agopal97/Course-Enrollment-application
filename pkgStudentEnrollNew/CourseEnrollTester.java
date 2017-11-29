package pkgStudentEnrollNew;

/**
 * @version : 1.0
 * @author ashwing
 *
 */

public class CourseEnrollTester {

	/**
	 * Main Driver file to exeute the program.
	 * @param args
	 */
	public static void main(String[] args) {

		Registration r = new Registration();
		
		// Add Students...
		addStudents(r);

		// Print the Student List
		System.out.println("Print Student List:-");
		r.printStudent();
		// r.deleteStudent(21); // Deletes student with ID 212

		// Add Courses
		// Course (Course ID, Title, Which Semester, Instructor, ClassRoom)
		addCourses(r);
		
		// Print the Course List
		System.out.println("\nPrint Course List:-");
		r.printCourses();

		// Register for Courses
		registerForCourses(r);
		
		// Print Registered & Waitlisted Courses.....
		r.printRegistrationDetail();
	}

	
	/**
	 * Comments: Add students to Student class
	 * @param reg
	 * @return void
	 */
	public static void addStudents(Registration reg) {
		reg.addStudent(new Student(27, "Tony", 120, "Computer Science"));
		reg.addStudent(new Student(14, "Kyara", 125, "Civil Engineering"));
		reg.addStudent(new Student(33, "Dan", 120, "Economics"));
		reg.addStudent(new Student(12, "John", 125, "Mechanical Engineering")); // Add a student to the Registry
		reg.addStudent(new Student(21, "Jane", 125, "Chemical Engineering")); // Add another Student
		reg.addStudent(new Student(21, "Jane", 126, "Psychology")); // Cannot take more than one course - This helps to check
	}
 
	/**
	 * Comments: Add Course to Course class
	 * @param reg
	 * @return void
	 */
	public static void addCourses(Registration reg) {
		reg.addCourse(new Course(1, "Hist 201", "Semester 2", "John", "ClassRoom: 101"));
		reg.addCourse(new Course(2, "Maths 204", "Semester 1", "Greg", "ClassRoom: 105"));
		reg.addCourse(new Course(4, "Physics 101", "Semester 1", "Kara", "ClassRoom: 105"));
		reg.addCourse(new Course(5, "Chemistry 102", "Semester 1", "Kim", "ClassRoom: 106"));
		reg.addCourse(new Course(1, "Maths 204", "Semester 1", "Greg", "ClassRoom: 105")); // Cannot take more than one course - This helps to check
		reg.addCourse(new Course(3, "Physics 205", "Semester 2", "Mac", "ClassRoom: 107"));
		}

	/**
	 * Comments: Register Courses
	 * @param reg
	 * @return void
	 */
	public static void registerForCourses(Registration reg) {
		// Register for courses
		reg.registerForCourse(21, 1);
		reg.registerForCourse(21, 2);

		reg.registerForCourse(14, 3);
		reg.registerForCourse(14, 4);
		reg.registerForCourse(14, 1);  // This entry should go to Waitlisted category...

	}
}
