import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class RepeatAndMissingNumberArray {

	public static void main(String[] args) {
		int[] arr = { 1,2,3,4,5,6,3,8,9 };
		int sortedarr[] = doSelectionSort(arr);
		findrepeatandmissing(sortedarr);

	}

	private static void findrepeatandmissing(int[] sortedarr) {
		int repeat = 0, missing = 0;

		for (int i = 0; i < sortedarr.length - 1; i++) {
			if (sortedarr[i] == sortedarr[i + 1]) {
				repeat = sortedarr[i];
			}
			if (sortedarr[i + 1] != sortedarr[i] + 1) {
				missing = sortedarr[i] + 1;
			}
		}
		System.out.println("repeated: " + repeat);
		System.out.println("missing: " + missing);
	}

	public static int[] doSelectionSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[index])
					index = j;

			int smallerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = smallerNumber;
		}
		return arr;
	}

}
