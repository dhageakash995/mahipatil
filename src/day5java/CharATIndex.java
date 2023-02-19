package day5java;
import java.util.Scanner;
public class CharATIndex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String str = sc.nextLine();
		System.out.println("Enter a index number:");
		int n=sc.nextInt();
		char c = str.charAt(n);
		System.out.println("character at given index :"+n+"is:"+c);
	}
}
