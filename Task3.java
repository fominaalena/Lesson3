import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������� ������� ����:");
		int a = in.nextInt();
		double sRound = (Math.PI*a*a)/4;
		System.out.println("������� ������ ����:");
		int b = in.nextInt();
		double sSide  = (Math.PI*a*b);
		double sum = sRound + sSide;
		System.out.println("������� ������:");
		int � = in.nextInt();
		double fin = Math.ceil(sum/�);
		System.out.println("���������� "+ fin + " �����");
	}
	

}
