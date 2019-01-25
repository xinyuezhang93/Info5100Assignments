/**
 * Assignment for your lecture 2. Please finish all the questions under 'Assignment'
 * Please try to finish the extra credit question. 
 * The deadline of this assignment is 01/25/2019 23:59 PST.
 * Please feel free to contact Fiona for any questions.
 * TA office hour: Tuesday 1 pm -- 4 pm
 */

class Employee {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month

    // Constructor. Please set all the data in constructor.
    public Employee(String name, int age, Gender gender, double salary) {
    		//write your code here
	    this.name = name;
	    this.age = age;
	    this.gender = gender;
	    this.salary = salary;
    }
    
    // Getter for `name`. Return the current `name` data
    public String getName() {
    		//write your code here
    	return name;
    }

    // Setter for `name`. Set `name` data
    public void setName(String name) {
    		//write your code here
    	this.name = name;
    }
    
    public void raiseSalary(double byPercent) {
    	salary *= byPercent;
    }
    
}

enum Gender {
    MALE,
    FEMALE;
}


public class Assignment2 {
    // Assignment
    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public double socialSecurityTax(Employee employee) {
        //write your code here
    	if (employee.salary <= 8900) {
    		System.out.println(employee.salary * 6.2 / 100);
    		return employee.salary * 6.2 / 100;
    	} else {
    		System.out.println(106800 * 6.2 / 100);
    		return 106800 * 6.2 / 100;
    		
    	}
    }

    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public static double insuranceCoverage(Employee employee) {
        //write your code here
    	if (employee.age <= 35) {
    		System.out.println(employee.salary * 0.03);
    		return employee.salary * 0.03;
    	} else if (employee.age <= 50) {
    		System.out.println(employee.salary * 0.04);
    		return employee.salary * 0.04;
    	} else if (employee.age <= 60) {
    		System.out.println(employee.salary * 0.05);
    		return employee.salary * 0.05;
    	} else {	
    		System.out.println(employee.salary * 0.06);
    		return employee.salary * 0.06;
    	}
    }

    /**
     * Write a method to sort three employees' salary from low to high, and then print their name in order.
     * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
     * John Alice Jenny
     */
    public void sortSalary(Employee e1, Employee e2, Employee e3) {
        //write your code here
    	if (e1.salary > e2.salary) {
    		Employee temp = e1;
    	    e1 = e2;
    	    e2 = temp;
    	}
    	if (e2.salary > e3.salary) {
  	      Employee temp = e2;
  	      e2 = e3;
  	      e3 = temp;
  	    }
    	if (e1.salary > e2.salary) {
  	      Employee temp = e1;
  	      e1 = e2;
  	      e2 = temp;
  	    }
    	System.out.println(e1.name +' '+ e2.name + ' ' + e3.name);
    }

    /**
     * Write a method to raise an employee's salary to three times of his/her original salary.
     * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
     * Do not change the input of this method.
     * Try to add a new method in Employee class: public void raiseSalary(double byPercent)  
     */
    public void tripleSalary(Employee employee) {
        //write your code here
    	employee.raiseSalary(3);
//    	System.out.println(employee.salary);
    	
    }
   


    //Extra credit

    /**
     * I have written some code below. What I want is to swap two Employee objects.
     * One is Jenny and one is John. But after running it, I got the result below:
     * Before: a=Jenny
     * Before: b=John
     * After: a=Jenny
     * After: b=John
     * There is no change after swap()! Do you know the reason why my swap failed?
     * Write your understanding of the reason and explain it.
     */
    /*
     write your understanding here.
     Your Answer: In function main, a and b are pointing to Employee objects with name 'Jenny' and 'Jone, respectively.
     When using swap, new pointers x and y in function swap will point to Employee objects that are pointed by a and b, respecitively.
     In function swap, x and y are swaping what they were pointing to.
     As a result, x is to object with name 'John', y is to object with name 'Jenny.
     However, a and b in function main do not change what they are pointing to and stay the same.
     So, when we want to get names of a and b, the results will not change.
        
    */
    public static void main(String[] args) {
        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 100);
        Employee b = new Employee("John", 30, Gender.MALE, 2500);
//        Employee c = new Employee("Alice", 30, Gender.MALE, 1000);
        System.out.println("Before: a=" + a.getName());
        System.out.println("Before: b=" + b.getName());
        
//        Assignment2 assign = new Assignment2(); 
//        assign.sortSalary(a,b,c);
//        assign.tripleSalary(a);
        swap(a, b);// 
//        Employee temp = a;
//        a = b;
//        b = temp;
        System.out.println("After: a=" + a.getName());
        System.out.println("After: b=" + b.getName());
    }

    public static void swap(Employee x, Employee y) {
        Employee temp = x;
        x = y;
        y = temp;
    }
}

