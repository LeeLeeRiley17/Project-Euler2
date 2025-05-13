public class MyProgram
{
    public static void main(String[] args)
    {
        int max = 32;
		
		// create the array to hold the sequence of Fibonacci numbers
		long[] sequence = new long[max];
		//create the first 2 Fibonacci sequence elements
		sequence[0] = 1;
		sequence[1] = 2;
		
		
		//create the Fibonacci sequence and store it in int[] sequence
		for (int x=2; x<max; x++)
		
		    sequence[x] = sequence[x-1] + sequence[x-2];
		    
		    
		    System.out.println("last element in the array: "  + sequence[max-1]);
		    
		    System.out.println("sum of all even elements: "); 
    }
}