
public class Course {
	private String name;
	private int numberOfStudent = 0;
	private Student[] students = new Student[10];
	private int maxStudent = 10;
	
	Course(String name){
		this.name = name;
	}

	public int getNumberOfStudent() {
		System.out.println("Number of students: " + numberOfStudent);
		return numberOfStudent;
	}
	
	public String getName() {
		System.out.println("Course's title is " + name);
		return name;
	}

	public Student[] getStudents() {
		System.out.println("Students that register this course:");
		for (int i=1;i<=numberOfStudent;i++) {
			System.out.println("No." + i + ':' + students[i-1].getName() + ' ' + students[i-1].getId());
		}
		return students;
	}
	
	public boolean isFull() {
		if (numberOfStudent < maxStudent) {
			return false;
		} else {
			return true;
		}
	}
	
	public void registerStudent(Student student) {
		if (!isFull()) {
			students[numberOfStudent] = student;
			numberOfStudent += 1;
			System.out.println("Congras " + student.getName() + ", Register sucessfully to course:" + name);
		} else {
			System.out.println("Sorry, this course is full.");
		}
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
