// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) 
	{
		int seed = 1;
		int maxSeed = Integer.parseInt(args[0]);
		String mode = args[1];
		int origMaxSeed = maxSeed;
		int seedForLoop = maxSeed;

		if (mode == "v")
		{
			for (int i = 0; i < seedForLoop; i++)
			{
				while (maxSeed != 1)
				{
					System.out.println(maxSeed);
					if (maxSeed % 2 == 0)
					{
						maxSeed = maxSeed / 2;
					}
					else
					{
						maxSeed = (maxSeed * 3) + 1;
					}
				}
				seedForLoop --;
			}
			System.out.println("1");
		}
		
		System.out.println("Every one of the first " + origMaxSeed + " hailstone sequences reached 1.");


	}
}
