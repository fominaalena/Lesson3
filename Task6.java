import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������� ����� �����:");
		int x = in.nextInt();

		if (x == 0) {
			System.out.println("������ ����.�� �� �������� �� �������������, �� �������������.");
		}
		if (x < 0) {
			System.out.println("������ ����� �������� �������������.");
		}
		if (x > 0){
			System.out.println("������ ����� �������� ������������.");
		}
		int m = 0;
		for( ; x!=0; x/=10) {
			++m;
		}
		System.out.println("�������� ����� �������� "+m+"-�������.");
		}
	}
	
