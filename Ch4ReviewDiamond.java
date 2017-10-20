import java.util.Scanner;
public class Ch4ReviewDiamond {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Enter an integer for the side length: ");
		int length = in.nextInt();
		int numberLineTop = length;
		int numberLineBottom = length-1;
		int numberDotsBottom= length+(length-1)-2;
		
		for (int i =1;i <=numberLineTop;i++)
		{
			for(int s= 1; s<=length-i;s++)
			{
				System.out.print(" ");
			}
			for (int j = 1;j<=i+(i-1);j++)
			{
				
				System.out.print("*");
				
			}
			System.out.println();
		}
						
		for (int x =1;x<=numberLineBottom;x++)
		{	
			for(int t = 1; t<=x;t++)
			{
				System.out.print(" ");
			}
			for (int y = x; y<=numberDotsBottom-(x-1) ;y++)
				{
					System.out.print("*");
					
				}
			System.out.println();
			
		}
	}
	
		
		
	}


