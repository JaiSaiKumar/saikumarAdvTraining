package ProblemStatement6.ProblemStatement6_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentArrayList {
	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();
		int n ;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number of Student : ");
		n=sc.nextInt();
		
		
		for(int i=0 ;i<n;i++)
		{
			System.out.println("Student name :");
			alist.add(sc.next()) ;
		}
		System.out.println("Student list :");
		for (String a:alist)
		{
			System.out.println(a);
		}
		System.out.println(" Enter the name of student to be searched : ");
		String str =sc.next();
		int position = Collections.binarySearch(alist, str);
		System.out.println(" Position of "+ str + " is : "+position );
		
	}

}
