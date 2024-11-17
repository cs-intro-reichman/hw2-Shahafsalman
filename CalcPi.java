// Computes an approximation of PI.


public class CalcPi {
	public static void main(String [] args) 
	{ 
		int num = Integer.parseInt(args[0]);

		double divNum = 3;
		double sum = 1;
		int evenNum = 2;

		for (int i= 1; i < num; i++)
		{
			if (evenNum%2 == 0)
			{
				sum -= (1/divNum);
				divNum += 2;
				evenNum ++;
			}
			else
			{
				sum += (1/divNum);
				divNum += 2;
				evenNum ++;
			}
		}

		System.out.println("pi  according to Java: " + Math.PI);
		System.out.println("pi, approximated:  "	+	sum * 4);
	}
}
