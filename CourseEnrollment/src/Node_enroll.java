/**
 * 
 */

/**
 * @author ashwing
 *
 */
public class Node_enroll {
		public Student stdata;
		public Course coursedata;
		public Node_enroll next;
		
		public Node_enroll(Student studentObj) {
		    this.stdata = studentObj;
		}
		
		public Node_enroll(Course courseObj) {
		    this.coursedata = courseObj;
		}
		
		public void displayNode() {
		    System.out.print(stdata.getDetail() + coursedata.getDetail() + "  ");
		 }
		}
