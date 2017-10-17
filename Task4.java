import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите четырехзначное число:");
		int x = in.nextInt();

		int first = x/1000;
		int sec = (x/100)%10;
		int third = (x/10)%10;
		int forth = x%10;
		
		int ab = first*sec;
		int cd = third*forth;
		
		System.out.println(ab+cd);
	}

}
