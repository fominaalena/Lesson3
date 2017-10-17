import java.util.Arrays;

public class Task10 {

	public static void main(String[] args) {
		
		int numbers[] = new int[] { -21, -10, 14, 3, 55, 87, 210, 111 };
		int value = numbers[0];
		int index = -1;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > 0) {
				value = numbers[i];
				index = i;
				break;
				}
		}
		System.out.println("Значение элемента = " + value);
		System.out.println("[i] = " + index);
	}
}

