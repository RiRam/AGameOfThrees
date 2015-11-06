
/**
 * Ri Ram
 * 11-5-2015
 * Challenge #239 A Game of Threes
 * https://redd.it/3r7wxz
 */
public class Threes {
	
	public static void main(String[] args)
	{
		//test input given in the challenge
		aGameOfThrees(100);
		/* 
		 * Output:
		 * 100 -1
		 * 33 0
		 * 11 +1
		 * 4 -1
		 * 1
		 */
		
		//challenge input
		aGameOfThrees(31337357);
		/*
		 * Output:
		 * 31337357 +1
		 * 10445786 +1
		 * 3481929 0
		 * 1160643 0
		 * 386881 -1
		 * 128960 +1
		 * 42987 0
		 * 14329 -1
		 * 4776 0
		 * 1592 +1
		 * 531 0
		 * 177 0
		 * 59 +1
		 * 20 +1
		 * 7 -1
		 * 2 +1
		 * 1
		 */
	}
	
	/**
	 * Plays "A Game of Threes"
	 * @param int num - starting number for the game
	 */
	public static void aGameOfThrees(int num)
	{
		while(num != 1)
		{
			System.out.print(num);
			if(num % 3 == 0)
			{
				num = num/3;
				System.out.print(" 0\n");
			}
			else if((num - 1) % 3 == 0)
			{
				num = (num - 1) / 3;
				System.out.print(" -1\n");
			}
			else if((num + 1) % 3 == 0)
			{
				num = (num + 1) / 3;
				System.out.print(" +1\n");
			}
		}
		if(num == 1)
			System.out.println(num);
	}
}
