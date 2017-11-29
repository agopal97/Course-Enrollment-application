package pkgStudentEnrollNew;

import java.util.Iterator;
import java.util.LinkedList;


/**
 * @version 1.0
 * @author ashwing
 *
 */

public class Registration {
	LinkedList<Student> studentList;
	LinkedList<Course> courseList;
	

	public Registration() { // Creates studentList
		studentList = new LinkedList<>();
		courseList = new LinkedList<>();
	}

	/**
	 * @category  Add Student to Student List
	 * @return void
	 * @param aStudent
	 */
	public void addStudent(Student aStudent) {
		if (searchStudentList(aStudent.getID()) < 0) {
			studentList.add(aStudent);
		}
	}

	/**
	 * @category  Add Course to Course List
	 * @return void
	 * @param aCourse
	 */
	public void addCourse(Course aCourse) {
		if (searchCourseList(aCourse.getCRN()) < 0) {
			courseList.add(aCourse);
		}
	}

	/**
	 * Remove Student from the class
	 * @param studentID
	 */
	public void deleteStudent(int studentID) {
		int index = searchStudentList(studentID); // Gets index of the student in the Registry
		if (index == -1)
			throw new IllegalArgumentException("Student not found");
		// Since studentList is implemented as LinkedList, .remove removes element at
		// specified position
		studentList.remove(index);
	}

	// Search by studentID , if found, return position in the list
	/**
	 * Comment: Search Student from the list and return the Student ID...
	 * @param ID
	 * @return int
	 */
	public int searchStudentList(int ID) {
		Iterator<Student> it = studentList.iterator();

		int count = 0;
		while (it.hasNext()) {
			count++;
			Student temp;
			temp = it.next();
			if ((temp.getID()) == ID) {
				return count;

			}
		}
		return -1;
	}

	/**
	 * Comment: Get the Student details for a given Student ID
	 * @param ID
	 * @return Student class
	 */
	public Student getStudent(int ID) {
		Iterator<Student> it = studentList.iterator();
		Student temp = new Student();
		while (it.hasNext()) {
			temp = it.next();
			if ((temp.getID()) == ID) {
				break;
			}
		}
		return temp;
	}


	/**
	 * Comment: Search by Course ID , if found, return position in the list
	 * @param ID
	 * @return
	 */
	public int searchCourseList(int ID) {
		Iterator<Course> it = courseList.iterator();
		int count = 0;
		while (it.hasNext()) {
			count++;
			Course temp;
			temp = it.next();
			if ((temp.getCRN()) == ID) {
				return count;

			}
		}
		return -1;
	}

	
	/**
	 * Comment: Get the Course details for a given Course ID
	 * @param ID
	 * @return Course class
	 */
	public Course getCourse(int ID) {
		Iterator<Course> it = courseList.iterator();
		Course temp = new Course();
		while (it.hasNext()) {
			temp = it.next();
			if ((temp.getCRN()) == ID) {
				break;
			}
		}
		return temp;
	}
	
	/**
	 * Register for Course. if not add it to the waitlist
	 * @param StudentID
	 * @param courseID
	 */
	public void registerForCourse(int StudentID, int courseID) {
		Student aStudent = getStudent(StudentID);
		if (aStudent.getID() > 0) {
			// Valid Student
			Course aCourse = getCourse(courseID);
			if (aCourse.getCRN() > 0) {
				boolean iFlag = aStudent.associateCourse(aCourse);
				if (iFlag == false) {
					// Add to Wait list
					iFlag = aStudent.waitlistCourse(aCourse);
				}
			}
		}

	}
	/**
	 * Print Student Details
	 * @return void
	 */
	public void printStudent() {
	    System.out.format("%5s %20s %11s %30s", "ID", "Name", "CreditHours", "Major");
	    System.out.println();
	    System.out.println("================================================================================");

		
		for (Student student : studentList) {
			student.format();
			System.out.println();
		}
	}
	
	/**
	 * Print Courses Details
	 * @return void
	 */
	public String printCourses() {
	    System.out.format("%5s %19s %7s %21s %19s", "CRN", "Title", "Semester", "Instructor", "Classroom");
	    System.out.println();
	    System.out.println("================================================================================");

		for (Course course : courseList) {
			course.format();
			System.out.println();
		}
		return "";
	}

	
	/**
	 * Print Registration details
	 * @return void
	 */
	public void printRegistrationDetail() {
		System.out.println();
		System.out.println(
				"=============================  Course Registration Details ===========================================");
		System.out.println();
		System.out.format("%5s %15s %11s %30s %20s", "Student ID", "Name", "Course ID", "Title", "Status");
		System.out.println();
		System.out.println(
				"==============================================================================================");

		for (Student student : studentList) {
			for (Course temp : student.getEnrolledCourses()) {
				if (temp != null) {
					System.out.format("%5s %20s %11s %30s %20s", student.getID(), student.getName(), temp.getCRN(),
							temp.getTitle(), "Enrolled");
					System.out.println();
				} else
					break;
			}

			// Waitlisted list
			for (Course temp : student.getWaitListed()) {
				if (temp != null) {
					System.out.format("%5s %20s %11s %30s %20s", student.getID(), student.getName(), temp.getCRN(),
							temp.getTitle(), "Waitlisted");
					System.out.println();
				} else
					break;
			}

		}
	}
	@Override
	public String toString() {
		for (Student student : studentList) {
			student.format();
			System.out.println();
		}
		return "";
	}

}
