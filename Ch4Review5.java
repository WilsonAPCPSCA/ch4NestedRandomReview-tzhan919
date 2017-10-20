import java.util.Scanner;
import java.util.Random;
public class Ch4Review5 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Random rnd = new Random();
		System.out.println("This program will simulate tossing a pair of dice.");
		System.out.println("How many times would you like the dice to be tossed?");
		int toss = in.nextInt();
		int dice1 = 0;
		int dice2 = 0;
		int d1 = 0;
		int d2 = 0;
		int count = 1;
		int total  = 0;
		int count2=0;
		int count3=0;
		int count4=0;
		int count5=0;
		int count6=0;
		int count7=0;
		int count8=0;
		int count9=0;
		int count10=0;
		int count11=0;
		int count12=0;
		System.out.println("Here is the sequence of sums, one for each toss: ");
		while (count <= toss){
			count++;
			dice1 = rnd.nextInt(5);
			dice2 = rnd.nextInt(5);
			d1 = dice1 + 1;
			d2 = dice2 + 1;	
			total = d1 + d2;
			System.out.print(" "  +total);
			
			if (total==2)
			{
				count2++;
			}
			else if (total==3)
			{
				count3++;
			}
			else if (total==4)
			{
				count4++;
			}
			else if (total==5)
			{
				count5++;
			}
			else if (total==6)
			{
				count6++;
			}
			else if (total==7)
			{
				count7++;
			}
			else if (total==8)
			{
				count8++;
			}
			else if (total==9)
			{
				count9++;
			}
			else if (total==10)
			{
				count10++;
			}
			else if (total==11)
			{
				count11++;
			}
			else if (total==12)
			{
				count12++;
			}
			
	}
		System.out.println();
		System.out.print("2: ");
		for (int a = 0;a<count2;a++)
		{
			System.out.print("*");
		}
		System.out.println();

		System.out.print("3: ");
		for (int a = 0;a<count3;a++)
		{
			System.out.print("*");
		}
		System.out.println();

		System.out.print("4: ");
		for (int a = 0;a<count4;a++)
		{
			System.out.print("*");
		}
		System.out.println();

		System.out.print("5: ");
		for (int a = 0;a<count5;a++)
		{
			System.out.print("*");
		}
		System.out.println();

		System.out.print("6: ");
		for (int a = 0;a<count6;a++)
		{
			System.out.print("*");
		}
		System.out.println();

		System.out.print("7: ");
		for (int a = 0;a<count7;a++)
		{
			System.out.print("*");
		}
		System.out.println();

		System.out.print("8: ");
		for (int a = 0;a<count8;a++)
		{
			System.out.print("*");
		}
		System.out.println();

		System.out.print("9: ");
		for (int a = 0;a<count9;a++)
		{
			System.out.print("*");
		}
		System.out.println();

		System.out.print("10: ");
		for (int a = 0;a<count10;a++)
		{
			System.out.print("*");
		}
		System.out.println();

		System.out.print("11: ");
		for (int a = 0;a<count11;a++)
		{
			System.out.print("*");
		}
		System.out.println();

		System.out.print("12: ");
		for (int a = 0;a<count12;a++)
		{
			System.out.print("*");
		}
	}
}
