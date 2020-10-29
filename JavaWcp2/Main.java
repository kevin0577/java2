public class Main {
	public static void main(String[] args) {
		int i = 1;
		while (i < 5) {
			System.out.println(i * i);
			i++;
		}

		int array[] = {1, 2, 3, 4};
		for (int i2 = 0; i2 < array.length; i2++) {
			System.out.println(array[i2]);
		}

		for (int val : array) {
			if (val % 2 == 0) {
				continue;
			}
			System.out.println(val);
		}
	}
}