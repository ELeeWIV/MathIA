import java.util.Random;
import java.util.ArrayList;

public class PartTest2 {
	private int newRand, cycleCount, place, cycle, iteration;
	float per, booarraysize, trueValues;
	private Random rnd;
	private boolean first, foundMatch;
	private int[] array1;
	private boolean[] booarray;

	public PartTest2(int n, int m) {
		rnd = new Random();
		newRand = 0;
		foundMatch = false;
		array1 = new int[n];
		cycle = n;
		cycleCount = n;
		iteration = m;
		trueValues = 0;
		booarray = new boolean[m];
		percentage();
	}

	public void test1() {
		int cycle = 0;
		while (cycle < this.cycle) {
			newRand = rnd.nextInt(365);
			array1[cycle] = newRand;
			cycle = cycle + 1;

		}
	}
	public boolean runEqualTest () {
		test1();
		int cycle = 0;
		int trueCount = 0;
		boolean finished = false;
		while (finished == false) {
			for ( int i = 0; i < cycleCount; i++) {
				int val1 = array1[i];
				trueCount = 0;
				for (int j = 0; j < cycleCount; j++) {
					int val2 = array1[j];
					if (val1 == val2) {
						if (trueCount == 2) {
							return true;
						}
						else {trueCount++;}
					}
				}
			}
			finished = true;
		}
		//System.out.println("false");
		return false;

	}
	public float percentage() {
		int iteration = 0;
		while (iteration < this.iteration) {
			boolean boovalue = runEqualTest();
			booarray[iteration] = (boovalue);
			iteration = iteration + 1;
		}
		for (boolean i : booarray) {
			if (i == true) {
				trueValues = trueValues + 1;
			}
			else {}
		}
		System.out.println(trueValues);
		booarraysize = booarray.length;
		System.out.println(booarraysize);
		per = trueValues/booarraysize;
		System.out.println(per);
		return per;
	}

	public static void main(String[] args) {
		PartTest2 pt2 = new PartTest2(364, 1000000000);
	}

}
