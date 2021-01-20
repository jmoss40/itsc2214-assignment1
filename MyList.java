/**
 * This class is part of Lab 1 for ITSC 2214: Data Structures.
 * This class defines a MyList object, which will be used to store information about the courses in the
 * Lab1InputFile.txt file. MyList objects will be stored in a stack, defined in the MyStack class.
 */
public class MyList {
	private String course_name;
	private String course_id;
	private Integer credit_hours;
	private MyList next;
	
	/**
	 * A constructor for the MyList class that takes no arguments and sets all attributes to 0 or null.
	 */
	public MyList() {
		this.course_name = null;
		this.course_id = null;
		this.credit_hours = 0;
		this.next = null;
	}
	
	/**
	 * A constructor for the MyList class that sets the attributes of the object to the parameters.
	 * @param course_name: The name of the course.
	 * @param course_id: The ID of the course.
	 * @param credit_hours: The number of credit hours that the course is worth.
	 */
	public MyList(String course_name, String course_id, Integer credit_hours) {
		this.course_name = course_name;
		this.course_id = course_id;
		this.credit_hours = credit_hours;
		this.next = null;
	}
	
	/**
	 * Returns the course name.
	 * @return course_name
	 */
	public String getCourseName() {
		return this.course_name;
	}
	
	/**
	 * Returns the course ID.
	 * @return course_id
	 */
	public String getCourseID() {
		return this.course_id;
	}
	
	/**
	 * Returns the number of credit hours for the course.
	 * @return credit_hours
	 */
	public Integer getCreditHours() {
		return this.credit_hours;
	}
	
	/**
	 * Returns a reference to the next MyList object in the list.
	 * @return next
	 */
	public MyList getNext() {
		return this.next;
	}
	
	/**
	 * Sets the course name to the specified name.
	 * @param course_name: the name to change it to.
	 */
	public void setCourseName(String course_name) {
		this.course_name = course_name;
	}
	
	/**
	 * Sets the course ID to the parameter id.
	 * @param course_id: the ID to set the course's ID to.
	 */
	public void setCourseID(String course_id) {
		this.course_id = course_id;
	}
	
	/**
	 * Sets the number of credit hours for the course.
	 * @param credit_hours: the number of credit hours to set it to.
	 */
	public void setCreditHours(Integer credit_hours) {
		this.credit_hours = credit_hours;
	}
	
	/**
	 * Sets the reference to the next MyList object in the linked list.
	 * @param next: The MyList object that should be next in the list after this one.
	 */
	public void setNext(MyList next) {
		this.next = next;
	}
	
	/**
	 * Returns a formatted string for representing this MyList object.
	 * @return a string containing the course name, id, and credit hours.
	 */
	@Override
	public String toString() {
		return
			"\nCourse name: " + course_name +
			"\nCourse id: " + course_id + 
			"\nCredit hours: " + credit_hours;
	}
}
