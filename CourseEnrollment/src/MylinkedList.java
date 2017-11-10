
public class MylinkedList {
	Node_enroll studentData = null;
	Node_enroll courseData = null;

	public MylinkedList() {
		super();
		studentData = null;
		courseData = null;
	}

	public boolean isEmpty() {
		return (studentData == null);
	}

	public boolean isCourseEmpty() {
		return (courseData == null);
	}

	public void addstudent(Student studentObj) {
		// this is just one way to implement the insert method
		// you can rewrite to use your own implementation
		Node_enroll snode = new Node_enroll(studentObj);
		snode.next = studentData;
		studentData = snode;

	}

	public void addcourse(Course courseObj) {
		// this is just one way to implement the insert method
		// you can rewrite to use your own implementation
		Node_enroll cnode = new Node_enroll(courseObj);
		cnode.next = courseData;
		courseData = cnode;

	}

	void displayList(Node_enroll sData) {
		while (sData != null) {
			System.out.println(sData.stdata.getDetail() + " ");
			sData = sData.next;
		}

	}

	void displayCourseList(Node_enroll cData) {
		while (cData != null) {
			System.out.println(cData.coursedata.getDetail() + " ");
			cData = cData.next;
		}

	}
}
