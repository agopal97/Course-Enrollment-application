/**
 * 
 */

/**
 * @author ashwing
 *
 */
public class Student {
	private int ID;
	private String Name;
	private int  CreditHoursCompleted;
	private String Major;
	
	
	
	Student (){
		
	}


	/**
	 * @param iD
	 * @param name
	 * @param creditHoursCompleted
	 * @param major
	 */
	public Student(int iD, String n, int cHC, String major) {
		super();
		ID = iD;
		Name = n;
		CreditHoursCompleted = cHC;
		Major = major;
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


	
	public String getDetail() {
		return "Student [ID=" + ID + ", Name=" + Name + ", CreditHoursCompleted=" + CreditHoursCompleted + ", Major="
				+ Major + "]";
	}
	
	
	
}
