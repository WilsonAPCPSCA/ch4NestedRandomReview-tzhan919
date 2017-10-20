import java.util.Scanner;

	public class Ch4Review4 {

public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	System.out.println("This program will simulate flipping a fair coin.");
	System.out.println("How many times would you like the coin to be flipped?");
	int flips = in.nextInt();
	int headCount = 0;
	int tailCount= 0;
	int count = 1;
	//for (int count = 1; count <= flips; count++){
	while (count <= flips){
		count++;
	double randomNum = Math.random();	
		if (randomNum >= 0.5){
			
			System.out.print("T");
			tailCount++;
		}
			else if(randomNum>=0&&randomNum<0.5)
			
			System.out.print("H");
		    headCount++;
		}
	int actualHeads = headCount - tailCount;
	System.out.println();
	System.out.println("There were " + actualHeads + " heads and " + tailCount + " tails.");



}

}



