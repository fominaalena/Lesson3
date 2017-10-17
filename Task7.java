import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите год:");
		int x = in.nextInt();
		if (x%4 == 0) {
			if (x%100 != 0)
			{
				System.out.println("¬ведЄнный год високосный, 366 дней в году");
			}
			else
			if (x%400 !=0) {
				System.out.println("¬ведЄнный год невисокосный, 365 дней в году");
			}
		}
		else
		System.out.println("¬ведЄнный год невисокосный, 365 дней в году");	
		}
	}
