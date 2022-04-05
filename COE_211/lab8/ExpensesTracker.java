
import java.io.*;
import java.util.Scanner;

public class ExpensesTracker{
	public static void main(String[] args) throws IOException{
		
		FileWriter fl = new FileWriter(new File("expenses.txt"));
		BufferedWriter bw = new BufferedWriter(fl);
		PrintWriter pr = new PrintWriter(bw);
		Scanner scan = new Scanner(System.in), fromFile = new Scanner("expenses.txt");
	String name,buy,ans,ans1;
	double price;	
		System.out.print("Input your name:");
		name = scan.next();
		
do{
	

	System.out.print("What did you purchase?");
	buy = scan.nextLine();
	System.out.print("How much did you pay?");
	price = scan.nextDouble();
	scan.nextLine();
	System.out.print("Would you like to log another purchase?(y/n)");
	 ans = scan.nextLine();
	
	pr.println(name + " purchased " + buy + " for " + price + " USD Dollars.");
}

while (ans.equals("y"));{
}pr.close();

System.out.println("Get off of Zoodmall!");


	}
}