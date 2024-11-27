import java.util.stream.IntStream;

public class Task4
{

	public static void main(String[] args)
	{
		if(args.length != 2)
		{
			System.out.println("Give a start and end integer value.");
			return;
		}

		try{
			int start = Integer.parseInt(args[0]);
			int end = Integer.parseInt(args[1]);
			addFirstToLast nums = (a, b) -> IntStream.rangeClosed(a,b).sum();
			int result = nums.add(start, end);
			System.out.println("Sum: " + result);
		}catch (NumberFormatException e) {
			System.out.println("Invalid input");
		}
	}



}
