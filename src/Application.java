public class Application {
	public static void main(String[] args) {
		
		//FYI: ctrl shift f formats tabs

		// WHILE LOOP:

		boolean myLoop1 = 4 < 5;
		// that's just one of many ways you can write TRUE

		// the point is: comparisons are booleans. they are either true or
		// false.

		int value = 10;
		while (value < 10)
		// this is false, because 10 = 10
		{
			System.out.println("Hello");
			value = value + 1;
			// that will increment value
		}

		while (value < 20)
		// this is true
		{
			System.out.println("Hello");
			value = value + 1;
			// that will increment value
			// needed here or it will be an infinite loop
		}

		// FOR LOOP:
		
		for(int i = 0; i < 5; i = i+1){
			//you can also type i++
			
			System.out.println("More hello");
			System.out.println("The value of i is: " + i);
			
			int j = 4;
			
			//here's it done with a "format specifier":
			System.out.printf("The value of i is: %d", i);
			//fyi you ran into two problems on that last line:
			//first was printLN doesn't work, you HAD to use printF
			//second, Q&As said you had to change compiler compliance level to 1.7
			//no idea what that is, or why either thing was an error
			
			//final note: %d specifically means int
			
			//try adding in more than one int with format specifiers:
			System.out.printf("The value of i is: %d and there is also %d", i, j);
			//it works!
		}

	}
}
