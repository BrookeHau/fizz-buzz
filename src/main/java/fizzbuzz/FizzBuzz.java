package fizzbuzz;

public class FizzBuzz {

	public String say(int number) {
		if (number % 3 == 0 && number % 5 == 0) {
			return "FizzBuzz";
		}
		if (number % 3 == 0) {
			return "Fizz";
		}
		if (number % 5 == 0) {
			return "Buzz";
		}
		return "The number is neither a multiple of three or five";
	}

}
