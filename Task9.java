import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		while (true) {
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите знак операции:");
		String c = in.next();
		if (c.equals(0)) {
			System.out.println("¬ведЄн ноль!");
		}
		switch (c) {
		case "+":
			System.out.println("¬ведите первое число:");
			int a = in.nextInt();
			System.out.println("¬ведите второе число:");
			int b = in.nextInt();
			int res1 = a + b;
			System.out.println(res1);
			break;
		case "-":
			System.out.println("¬ведите первое число:");
			int a2 = in.nextInt();
			System.out.println("¬ведите второе число:");
			int b2 = in.nextInt();
			int res2 = a2 - b2;
			System.out.println(res2);
			break;
		case "*":
			System.out.println("¬ведите первое число:");
			int a3 = in.nextInt();
			System.out.println("¬ведите второе число:");
			int b3 = in.nextInt();
			int res3 = a3 * b3;
			System.out.println(res3);
			break;
		case "/":
			System.out.println("¬ведите первое число:");
			int a4 = in.nextInt();
			System.out.println("¬ведите второе число:");
			int b4 = in.nextInt();
			if (b4!=0) {
				int res4 = a4 / b4;
				System.out.println(res4);
			}
			else
			System.out.println("Ќа ноль делить нельз€!");
			break;
		default: 
			System.out.println("¬ведите корректный знак операции!");
			break;
		}
		if (c.equals("0")) {
			System.out.println("ѕроцесс работы программы остановлен");
			break;
	}
}
}
}