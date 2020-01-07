import java.util.ArrayList;
import java.util.Random;

public class PartTest {

	private boolean foundMatch, first;
	private Random rnd;
	private ArrayList<Integer> array1, array2;
	private int newrand, tollcount, totalarr2, runcount, b;
	private float avgarr2, totalarr21;

	public PartTest() {
		foundMatch = false;
		first = true;
		rnd = new Random ();
		array1 = new ArrayList<Integer>();
		array2 = new ArrayList<Integer>();
		tollcount = 0;
		rnd = new Random();
		matchTest(200000);
		b = 0;
	}


	public void matchTest (int n) {
		runcount = 0;
		System.out.println("running");
		while (n > runcount) {
			while (foundMatch == false) {
				newrand = rnd.nextInt(365);
				//System.out.println(newrand);
				if (first == false) {
					for (int i : array1) {
						if (i == newrand) {
							foundMatch = true;
						}
					}
					array1.add(newrand);
				}
				if (first == true) {
					array1.add(newrand);
					first = false;
				}
				tollcount++;
			}
			
			if ((b%20) == 0 ) { 
				System.out.println(" " + (tollcount-1));
			}
			else { 
				System.out.print(" " + (tollcount-1)); 
			}
			b = b + 1;
			array2.add(tollcount - 1);
			resetVariables();
			runcount++;
		}
		average();

	}
	public void average() {
		for (int i : array2) {
			totalarr2 = totalarr2 + i;
		}
		System.out.println();
		System.out.println(totalarr2);
		totalarr21 = totalarr2;
		avgarr2 = totalarr21/(float)array2.size();
		System.out.println("average: " + avgarr2);
	}
	public void resetVariables () {
		foundMatch = false;
		first = true;
		tollcount = 0;
		array1.clear();
	}

	public static void main(String[] args) {
		PartTest pttst = new PartTest();
	}

}
