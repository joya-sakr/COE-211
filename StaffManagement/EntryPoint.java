import java.util.Scanner;

public class EntryPoint{
	public static void main(String[] args){


Scanner scan = new Scanner(System.in);
 
String FirstName,LastName;
int Age;
double MonthlySalary;


System.out.print("Please input the empoyee's first name: ");
	FirstName = scan.nextLine();
System.out.println("Please input the employee's last name: ");
	LastName = scan.nextLine();
System.out.println("Please input the employee's age: ");
	Age = scan.nextInt();
System.out.println("Please input the employee's monthly salary: ");
	MonthlySalary = scan.nextDouble();


Employee emp = new Employee(FirstName,LastName,Age,MonthlySalary);


System.out.println("Employee information: " + emp.FirstName + " " + emp.LastName +  ", " + emp.Age + ", " + emp.MonthlySalary);

}
}

 
	

	