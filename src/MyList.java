import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyList {

	private int[] list;
	private int length;

	public int[] createList(int listLength) {
		int[] listCreated = new int[listLength];
		for (int i = 0; i < listLength; i++) {
			listCreated[i] = (int) (Math.random() * 30);
		}
		System.out.println("The randomly created list:");
		System.out.println(Arrays.toString(listCreated));
		list = listCreated;
		length = listLength;
		return list;
	}

	public void add2Lowest() {

		int[] myArrayMin = new int[2];
		myArrayMin[0] = 30;
		myArrayMin[1] = 30;

		for (int i = 0; i < list.length; i++) {
			if (list[i] < myArrayMin[0]) {
				myArrayMin[0] = list[i];
			}
		}
		for (int i = 0; i < list.length; i++) {
			if (list[i] > myArrayMin[0] && list[i] < myArrayMin[1]) {
				myArrayMin[1] = list[i];
			}
		}
		int sum2Lowest = myArrayMin[0] + myArrayMin[1];
		System.out.println("The sum of the two lowest values is:");
		System.out.println(sum2Lowest);

	}

	public void removeUneven() {
		ArrayList<Integer> unevenArrayList = new ArrayList<Integer>();

		// Via de Integer wrapper ints naar de ArrayList schrijven
		for (int i = 0; i < length; i++) {
			unevenArrayList.add(list[i]);
		}

		// De oneven getallen er tussenuit halen
		for (int i = length - 1; i >= 0; i--) {
			if (list[i] % 2 != 0) {
				unevenArrayList.remove(i);
			}
		}
		System.out.println("The even number(s) in this list is/are:");
		System.out.println(unevenArrayList);
	}

	public void divideBy2354() {
		ArrayList<Integer> arrayListDivideBy2 = new ArrayList<Integer>();
		ArrayList<Integer> arrayListDivideBy3 = new ArrayList<Integer>();
		ArrayList<Integer> arrayListDivideBy4 = new ArrayList<Integer>();
		ArrayList<Integer> arrayListDivideBy5 = new ArrayList<Integer>();

		for (int i = 0; i < length; i++) {
			if (list[i] % 2 == 0) {
				arrayListDivideBy2.add(list[i]);
			}
		}
		for (int i = 0; i < length; i++) {
			if (list[i] % 3 == 0) {
				arrayListDivideBy3.add(list[i]);
			}
		}
		for (int i = 0; i < length; i++) {
			if (list[i] % 4 == 0) {
				arrayListDivideBy4.add(list[i]);
			}
		}
		for (int i = 0; i < length; i++) {
			if (list[i] % 5 == 0) {
				arrayListDivideBy5.add(list[i]);
			}
		}

		System.out.print("The amount of ints in list divisable by 2: ");
		System.out.println(arrayListDivideBy2.size());
		System.out.print("The amount of ints in list divisable by 3: ");
		System.out.println(arrayListDivideBy3.size());
		System.out.print("The amount of ints in list divisable by 4: ");
		System.out.println(arrayListDivideBy4.size());
		System.out.print("The amount of ints in list divisable by 5: ");
		System.out.println(arrayListDivideBy5.size());
	}

	public void sortHighToLow() {
		ArrayList<Integer> arrayListLowToHigh = new ArrayList<Integer>();
		for (int i = 0; i < length; i++) {
			arrayListLowToHigh.add(list[i]);
		}
		Collections.sort(arrayListLowToHigh);
		System.out.println("These are the ints from low to high:");
		System.out.println(arrayListLowToHigh);
	}

	public void sortHighToLowManual() {
		ArrayList<Integer> arrayListLowToHigh = new ArrayList<Integer>();
		for (int i = 0; i < length; i++) {
			arrayListLowToHigh.add(list[i]);
		}
		boolean completed = false;
		while (!completed) {
			completed = true;
			for (int i = 0; i < length - 1; i++) {
				if (arrayListLowToHigh.get(i) > arrayListLowToHigh.get(i + 1)) {
					int listHigherElement = arrayListLowToHigh.get(i);
					arrayListLowToHigh.set(i, arrayListLowToHigh.get(i + 1));
					arrayListLowToHigh.set(i + 1, listHigherElement);
					completed = false;
				}
			}
		}System.out
					.println("These are the ints manually set from low to high:");
			System.out.println(arrayListLowToHigh);
	}
}
