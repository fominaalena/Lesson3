import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������� ������ � �������� �����:");
		int x = in.nextInt();
		int y = in.nextInt();
		if (x%2 == 0) {
		System.out.println("�������� ����� " + y);
		}
		else {
		System.out.println("�������� ����� " + x);	
		}
		}
	}
