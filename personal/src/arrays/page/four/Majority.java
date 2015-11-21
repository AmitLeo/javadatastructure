package arrays.page.four;

/**
 * Majority Element Majority Element: A majority element in an array A[] of size
 * n is an element that appears more than n/2 times (and hence there is at most
 * one such element). Write a function which takes an array and emits the
 * majority element (if it exists), otherwise prints NONE as follows:
 * 
 * @author amishash
 *
 */
public class Majority {

	private int getElement(int argArr[]) {
		int maj_candidate = argArr[0];
		int maj_count = 1;
		for (int i = 1; i < argArr.length; i++) {
			if (maj_candidate == argArr[i])
				maj_count++;
			else
				maj_count--;
			if (maj_count == 0) {
				maj_candidate = argArr[i];
				maj_count = 1;
			}
		}
		return maj_candidate;
	}

	private boolean isMajorityCandidate(int argArr[], int argCandidate) {
		int count = 0;
		for (int i = 0; i < argArr.length; i++) {
			if (argArr[i] == argCandidate)
				count++;
		}
		if (count > argArr.length / 2)
			return true;
		else
			return false;
	}

	private boolean mooreVotingAlgorithm(int argArr[]) {
		return isMajorityCandidate(argArr, getElement(argArr));
	}

	public static void main(String[] args) {
		Majority majority = new Majority();
		System.out.println(majority.mooreVotingAlgorithm(new int[] { 1, 3, 3,
				1, 2 }));
		System.out.println(majority.mooreVotingAlgorithm(new int[] { 1, 3, 3,
				3, 2 }));
	}

}
