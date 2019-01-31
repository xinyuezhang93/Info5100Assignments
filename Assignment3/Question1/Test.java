public class Test {

	public static void main(String[] args) {
		
		Student s1 = new Student("s1", "001");
		Student s2 = new Student("s2", "002");
		Student s3 = new Student("s3", "003");
		Student s4 = new Student("s4", "004");
		Student s5 = new Student("s5", "005");
		Student s6 = new Student("s6", "006");
		Student s7 = new Student("s7", "007");
		Student s8 = new Student("s8", "008");
		Student s9 = new Student("s9", "009");
		Student s10 = new Student("s10", "010");
		Student s11 = new Student("s11", "011");
		Student s12 = new Student("s12", "012");
		
		Course course = new Course("happyhour");
		
		boolean isFull = course.isFull();
		System.out.println("is Full? - " + isFull);
		
		course.registerStudent(s1);
		course.registerStudent(s2);
		course.registerStudent(s3);
		course.registerStudent(s4);
		course.registerStudent(s5);
		course.registerStudent(s6);
		course.registerStudent(s7);
		course.registerStudent(s8);
		course.registerStudent(s9);
		course.registerStudent(s10);
		course.registerStudent(s11);
		course.registerStudent(s12);
		
		isFull = course.isFull();
		System.out.println("is Full? - " + isFull);
		
		Student[] students = course.getStudents();
	}
}
