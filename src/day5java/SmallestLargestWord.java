package day5java;

import java.util.Scanner;

public class SmallestLargestWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = sc.nextLine();
		
		String[] str1=str.split(" ");
		String smallest=str1[0];
		String largest=str1[0];
		for(int i=1;i<str1.length;i++)
		{
			if(str1[i].length()<smallest.length())
			{
				smallest=str1[i];
			}
			if(str1[i].length()>largest.length())
			{
				largest=str1[i];
				
			}
		}
		System.out.println("small word:"+smallest);
		System.out.println("larg word:"+largest);
	}

}
