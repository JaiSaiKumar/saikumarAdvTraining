package ProblemStatement2.ProblemStatement2_2;

import java.util.Scanner;

public class SumofPreviousNum {
	public static void main(String[] args) {

	    int i = 1, n = 13;
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println("Enter the firstTerm :");
	    int firstTerm =sc.nextInt();
        
        System.out.println("Enter the secondTerm:");
        int secondTerm =sc.nextInt();
        sc.nextLine();
        System.out.println(""+firstTerm +""+secondTerm);
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    while (i <= n) {
	      System.out.print(firstTerm + ", ");

	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;

	      i++;
	    }
	  }

}
