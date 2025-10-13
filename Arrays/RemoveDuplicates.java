import java.util.Arrays;

public class RemoveDuplicates {
	//Remove Duplicates when there is only positive value
	public static void main(String[] args) {
		int ar[] = { 1, 1, 2, 3, 4, 5, 5,-2,-4,-2,0,0};
		int count = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] != -1) {
				for (int j = i + 1; j < ar.length; j++) {
					if (ar[i] == ar[j]) {
						count++;
						ar[j] = '#';
					}
				}
			}
		}
		int res[] = new int[ar.length - count];

		for (int i = 0, j = 0; i < ar.length; i++) {
			if (ar[i] != -1)
				res[j++] = ar[i];
		}
		System.out.print(Arrays.toString(ar));
		System.out.println();
		System.out.print(Arrays.toString(res));
	}
}
