
public class Task12 {

	public static void main(String[] args) {
		int [] numbers = new int [] {5, 10, 8, 3, 12, 1, 14, 7, 6, 4};
		int result = 0;
		int j = 0;
		int sum = 0;
		for (int i = 1; i < numbers.length; i+=2) {
			if ( numbers[i]%2==0) {
				j++;
				sum += numbers[i];
			}
		}
		result = sum/j;
		System.out.println(result);
	}

}
