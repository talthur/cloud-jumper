package exercise;

import java.util.ArrayList;
import java.util.List;

public class Exercise {

	public static void main(String[] args) {

		List<Integer> c = new ArrayList<Integer>();
		c.add(0);
		c.add(0);
		c.add(0);
		c.add(1);
		c.add(0);
		c.add(0);
		System.out.println(jumpingOnClouds(c));

	}

	public static int jumpingOnClouds(List<Integer> c) {

		int tamanhoArray = c.size();
		int counterJumps = 0;
		int counter = 0;
		while (counter <= tamanhoArray - 2) {

			if (counter + 2 < tamanhoArray) {
				
				if (c.get(counter + 1) == 0 && c.get(counter + 2) == 0) {
					counter += 2;
					counterJumps++;
					continue;
				}

				if (c.get(counter + 1) == 1 && c.get(counter + 2) == 0) {
					counter += 2;
					counterJumps++;
					continue;
				}

				if (c.get(counter + 1) == 0 && c.get(counter + 1) == 0) {
					counter += 1;
					counterJumps++;
					continue;
				}
			} else {
				counter += 1;
				counterJumps++;
			}
		}

		return counterJumps;
	}

}
