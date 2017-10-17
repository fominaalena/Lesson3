import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите целое число:");
		int x = in.nextInt();

		if (x == 0) {
			System.out.println("Введен ноль.Он не является ни положительным, ни отрицательным.");
		}
		if (x < 0) {
			System.out.println("Данное число является отрицательным.");
		}
		if (x > 0){
			System.out.println("Данное число является положителным.");
		}
		int m = 0;
		for( ; x!=0; x/=10) {
			++m;
		}
		System.out.println("Введеное число является "+m+"-значным.");
		}
	}
	
