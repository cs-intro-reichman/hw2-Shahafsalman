// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) 
	{
		int seed = 1;
		String mode = "-";
		int maxSeed = Integer.parseInt("4");
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
				System.out.println(" ");
				seedForLoop --;
			}
			System.out.println("1");
		}
		System.out.println(mode + "Every one of the first " + origMaxSeed + " hailstone sequences reached 1.");

	}
}
