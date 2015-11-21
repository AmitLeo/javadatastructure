package arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Check if a given array contains duplicate elements within k distance from
 * each other
 * 
 * @author amishash
 */

public class DuplicateInstaces {
	public boolean solution(int argArr[], int distance) {
		Set<Integer> set = new HashSet<Integer>();
		int counter = 0;
		while (counter < distance) {
			int size = set.size();
			set.add(argArr[counter]);
			if (size == set.size())
				return true;
			counter++;
		}
		for (int i = distance; i < argArr.length; i++) {
			set.remove(argArr[i - distance]);
			set.add(argArr[i]);
			if (distance != set.size())
				return true;
		}
		return false;
	}

	public static void main(String[] args) {

		DuplicateInstaces duplicateInstaces = new DuplicateInstaces();
		System.out.println(duplicateInstaces.solution(new int[] { 1, 2, 3, 4,
				1, 2, 3, 4 }, 3));
		System.out.println(duplicateInstaces.solution(new int[] { 1, 2, 3, 1,
				4, 5 }, 3));
		System.out.println(duplicateInstaces.solution(
				new int[] { 1, 2, 3, 4, 5 }, 3));
		System.out.println(duplicateInstaces.solution(
				new int[] { 1, 2, 3, 4, 4 }, 3));

	}

}
