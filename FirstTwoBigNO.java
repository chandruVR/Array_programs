package Array_Programs;

public class FirstTwoBigNO {

	static void getbig() {
		int ar[] = { 2, 7, 9, 23, 4, 77, 9 };

		int max1 = ar[0];
		int max2 = ar[1];

		if (ar[0] > ar[1]) {
			max1 = ar[0];
			max2 = ar[1];
		} else {
			max1 = ar[1];
			max2 = ar[0];
		}

		for (int j = 2; j < ar.length; j++) {

			if (max1 < ar[j]) {
				max2 = max1;
				max1 = ar[j];
			} else if (max2 < ar[j]) {
				max2 = ar[j];
			}

		}
		System.out.println(max1);
		System.out.println(max2);
	}

	public static void main(String[] args) {
		getbig();

	}
}
