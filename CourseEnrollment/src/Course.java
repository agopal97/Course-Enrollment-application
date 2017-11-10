/**
 * 
 */

/**
 * @author ashwing
 *
 */
public class Course {
		private int CRN = 0;
		private String Title = "";
		private String SemesterOffered = "";
		private String  Instructor = "";
		private String Classroom = "";
		
		
		public Course() {
			
		}
		/**
		 * @param cRN
		 * @param title
		 * @param semesterOffered
		 * @param instructor
		 * @param classroom
		 */
		public Course(int cRN, String title, String semesterOffered, String instructor, String classroom) {
			super();
			CRN = cRN;
			Title = title;
			SemesterOffered = semesterOffered;
			Instructor = instructor;
			Classroom = classroom;
		}
		
		/**
		 * @return the cRN
		 */
		public int getCRN() {
			return CRN;
		}
		/**
		 * @param cRN the cRN to set
		 */
		public void setCRN(int cRN) {
			CRN = cRN;
		}
		/**
		 * @return the title
		 */
		public String getTitle() {
			return Title;
		}
		/**
		 * @param title the title to set
		 */
		public void setTitle(String title) {
			Title = title;
		}
		/**
		 * @return the semesterOffered
		 */
		public String getSemesterOffered() {
			return SemesterOffered;
		}
		/**
		 * @param semesterOffered the semesterOffered to set
		 */
		public void setSemesterOffered(String semesterOffered) {
			SemesterOffered = semesterOffered;
		}
		/**
		 * @return the instructor
		 */
		public String getInstructor() {
			return Instructor;
		}
		/**
		 * @param instructor the instructor to set
		 */
		public void setInstructor(String instructor) {
			Instructor = instructor;
		}
		/**
		 * @return the classroom
		 */
		public String getClassroom() {
			return Classroom;
		}
		/**
		 * @param classroom the classroom to set
		 */
		public void setClassroom(String classroom) {
			Classroom = classroom;
		}
		
		public String getDetail() {
			return "Course [CRN=" + CRN + ", Title=" + Title + ", SemesterOffered=" + SemesterOffered + ", Instructor="
					+ Instructor + ", Classroom=" + Classroom + "]";
			//return "Course [CRN=" + CRN;
		}
		
		
}
