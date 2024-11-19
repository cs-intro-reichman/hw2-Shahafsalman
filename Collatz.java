// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) 
	{
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		int num = 2;
		int save = 2;
		int count = 0;

		if (mode.equals("v"))
		{
		System.out.println("1 4 2 1 (4)");
		
		for (int i = 1; i < seed; i++ )
		{	
			System.out.print(num + " ");
			while (num != 1)
			{
				
				if (num % 2 == 0)
				{
					num = num / 2;
					System.out.print(num + " ");
					count ++;
				}
				else
				{
					num = num * 3 + 1;
					System.out.print(num + " ");
					count ++;
				}
				
			}
			count ++;
				System.out.println("(" + count + ")");
				num = save + 1;
				save ++;
				count = 0;
		}
		System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		}
		else
		{
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		}

	}
}
