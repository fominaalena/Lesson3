import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("������� ���:");
		int x = in.nextInt();
		if (x%4 == 0) {
			if (x%100 != 0)
			{
				System.out.println("�������� ��� ����������, 366 ���� � ����");
			}
			else
			if (x%400 !=0) {
				System.out.println("�������� ��� ������������, 365 ���� � ����");
			}
		}
		else
		System.out.println("�������� ��� ������������, 365 ���� � ����");	
		}
	}
