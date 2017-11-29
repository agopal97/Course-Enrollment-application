package pkgStudentEnrollNew;

/**
 * @version 1.0
 * @author ashwing
 *
 */
public class Student {
	private int ID;
	private String Name;
	private int  CreditHoursCompleted;
	private String Major;
	private Course[] enrollCourses;
	private Course[] waitListed;
	
	
	/**
	 * Defult constructor 
	 */
	public Student() {
		super();
		CreditHoursCompleted = ID = 0;
		Major = Name = "";
		
	}



	/**
	 * Constructor for Student
	 * @param iD
	 * @param name
	 * @param creditHoursCompleted
	 * @param major
	 */
	public Student(int iD, String name, int creditHoursCompleted, String major) {
		super();
		ID = iD;
		Name = name;
		CreditHoursCompleted = creditHoursCompleted;
		Major = major;
		enrollCourses = new Course[2];
		waitListed = new Course[10];
	}





	/**
	 * Create size of array for enrolling students in no more than 2 courses, and waitlisted section can only place up 10 students.
	 * @return Course[]
	 */
	public Course[] getEnrolledCourses() {
		return enrollCourses;
	}

	
	public Course[] getWaitListed() {
		return waitListed;
	}



	public void setWaitListed(Course[] waitListed) {
		this.waitListed = waitListed;
	}



	/**
	 * Set methods for enrolling waitlisting.
	 * @param courses
	 */
	public void setCourses(Course[] courses) {
		this.enrollCourses = courses;
	}

	public void setMaxCourse(int Size) {
		enrollCourses = new Course[Size];
	}

	public void setMaxWaitlistedCourse(int Size) {
		waitListed = new Course[Size];
	}
	/**
	 * Method to enroll students in courses.
	 * @param enrollCourses
	 */
	public boolean associateCourse(Course course) {
		int i , j = 0;
		i = this.enrollCourses.length;
		for (Course temp : this.enrollCourses) {
			if (temp != null)
		        j++;
			else
				break;
		}
		if (j < i) {
			this.enrollCourses[j] = course;
			return true;
		} else return false;
	}
	/**
	 * Method to place students in waitlist for courses.
	 * @param course
	 * @return a boolean if checked
	 */
	public boolean waitlistCourse(Course course) {
		int i , j = 0;
		i = this.waitListed.length;
		for (Course temp : this.waitListed) {
			if (temp != null)
		        j++;
			else
				break;
		}
		if (j < i) {
			this.waitListed[j] = course;
			return true;
		} else return false;
	}
	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}


	/**
	 * @param i the iD to set
	 */
	public void setID(int i) {
		ID = i;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}


	/**
	 * @return the creditHoursCompleted
	 */
	public int getCreditHoursCompleted() {
		return CreditHoursCompleted;
	}


	/**
	 * @param creditHoursCompleted the creditHoursCompleted to set
	 */
	public void setCreditHoursCompleted(int creditHoursCompleted) {
		CreditHoursCompleted = creditHoursCompleted;
	}


	/**
	 * @return the major
	 */
	public String getMajor() {
		return Major;
	}


	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		Major = major;
	}


	
	@Override
	public String toString() {
		return "Student [ID=" + ID + ", Name=" + Name + ", CreditHoursCompleted=" + CreditHoursCompleted + ", Major="
				+ Major + "]";
	}
	
	public void format() {
	    System.out.format("%5s %20s %11s %30s", ID, Name, CreditHoursCompleted, Major);
	  }
	
}
