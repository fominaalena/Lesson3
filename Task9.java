import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		while (true) {
		Scanner in = new Scanner(System.in);
		System.out.println("������� ���� ��������:");
		String c = in.next();
		if (c.equals(0)) {
			System.out.println("����� ����!");
		}
		switch (c) {
		case "+":
			System.out.println("������� ������ �����:");
			int a = in.nextInt();
			System.out.println("������� ������ �����:");
			int b = in.nextInt();
			int res1 = a + b;
			System.out.println(res1);
			break;
		case "-":
			System.out.println("������� ������ �����:");
			int a2 = in.nextInt();
			System.out.println("������� ������ �����:");
			int b2 = in.nextInt();
			int res2 = a2 - b2;
			System.out.println(res2);
			break;
		case "*":
			System.out.println("������� ������ �����:");
			int a3 = in.nextInt();
			System.out.println("������� ������ �����:");
			int b3 = in.nextInt();
			int res3 = a3 * b3;
			System.out.println(res3);
			break;
		case "/":
			System.out.println("������� ������ �����:");
			int a4 = in.nextInt();
			System.out.println("������� ������ �����:");
			int b4 = in.nextInt();
			if (b4!=0) {
				int res4 = a4 / b4;
				System.out.println(res4);
			}
			else
			System.out.println("�� ���� ������ ������!");
			break;
		default: 
			System.out.println("������� ���������� ���� ��������!");
			break;
		}
		if (c.equals("0")) {
			System.out.println("������� ������ ��������� ����������");
			break;
	}
}
}
}