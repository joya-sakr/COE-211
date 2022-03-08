import java.util.Scanner;

public class Employee {
    // Initializing variables
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee() {
        // Get user input
        Scanner scan = new Scanner(System.in);

      
System.out.print("Please input the empoyee's first name: ");
	FirstName = scan.nextLine();
System.out.println("Please input the employee's last name: ");
	LastName = scan.nextLine();
System.out.println("Please input the employee's age: ");
	Age = scan.nextInt();
System.out.println("Please input the employee's monthly salary: ");
	MonthlySalary = scan.nextDouble();


    }

    public String toString() {
      String output "Employee information: " + emp.FirstName + " " + emp.LastName +  ", " + emp.Age + ", " + emp.MonthlySalary;
return output;
    }

}