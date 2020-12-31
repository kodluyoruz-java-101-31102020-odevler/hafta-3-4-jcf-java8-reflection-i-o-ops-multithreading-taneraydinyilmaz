package questionThree;

public class Student {

	private int studentID;
	private String department;
	private String studentName;
	private String studentLastname;

	public Student(int studentID, String department, String studentName, String studentLastname) {
		this.studentID = studentID;
		this.department = department;
		this.studentName = studentName;
		this.studentLastname = studentLastname;
	}

	/**
	 * @return the studentID
	 */
	public int getStudentID() {
		return studentID;
	}

	/**
	 * @param studentID the studentID to set
	 */
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}

	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	/**
	 * @return the studentLastname
	 */
	public String getStudentLastname() {
		return studentLastname;
	}

	/**
	 * @param studentLastname the studentLastname to set
	 */
	public void setStudentLastname(String studentLastname) {
		this.studentLastname = studentLastname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((department == null) ? 0 : department.hashCode());
		result = prime * result + studentID;
		result = prime * result + ((studentLastname == null) ? 0 : studentLastname.hashCode());
		result = prime * result + ((studentName == null) ? 0 : studentName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (department == null) {
			if (other.department != null)
				return false;
		} else if (!department.equals(other.department))
			return false;
		if (studentID != other.studentID)
			return false;
		if (studentLastname == null) {
			if (other.studentLastname != null)
				return false;
		} else if (!studentLastname.equals(other.studentLastname))
			return false;
		if (studentName == null) {
			if (other.studentName != null)
				return false;
		} else if (!studentName.equals(other.studentName))
			return false;
		return true;
	}

}
