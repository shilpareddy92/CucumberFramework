package seleniumTests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class opentextQuestion4 {

	public static void main(String[] args) {

		List<Integer> arl = new ArrayList<Integer>();
		arl.add(11);
		arl.add(12);
		arl.add(13);
		List<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(11);
		ar2.add(14);
		ar2.add(15);
		List<Integer> ar3 = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		set.addAll(arl);
		set.addAll(ar2);
		for (Integer i : set) {
			System.out.print(i + " ");
		}
		int arr1[] = { 11, 12, 13};
        int arr2[] = { 11, 14, 15};
 
        int n1 = arr1.length;
        int n2 = arr2.length;
 
        printUncommon(arr1, arr2, n1, n2);
	}

	static void printUncommon(int arr1[], int arr2[], int n1, int n2) {

		int i = 0, j = 0, k = 0;
		while (i < n1 && j < n2) {
			if (arr1[i] < arr2[j]) {
				System.out.print(arr1[i] + " ");
				i++;
				k++;
			} else if (arr2[j] < arr1[i]) {
				System.out.print(arr2[j] + " ");
				k++;
				j++;
			}

			else {
				i++;
				j++;
			}
		}

		// printing remaining elements
		while (i < n1) {
			System.out.print(arr1[i] + " ");
			i++;
			k++;
		}
		while (j < n2) {
			System.out.print(arr2[j] + " ");
			j++;
			k++;
		}
	}

}
