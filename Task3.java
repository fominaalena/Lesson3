import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите диаметр бака:");
		int a = in.nextInt();
		double sRound = (Math.PI*a*a)/4;
		System.out.println("Введите высоту бака:");
		int b = in.nextInt();
		double sSide  = (Math.PI*a*b);
		double sum = sRound + sSide;
		System.out.println("Введите расход:");
		int с = in.nextInt();
		double fin = Math.ceil(sum/с);
		System.out.println("Необходимо "+ fin + " банок");
	}
	

}
