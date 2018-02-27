package fizzbuzz;

public class FizzBuzzApp {

	public static void main(String[] args) {

		FizzBuzz test = new FizzBuzz();

		System.out.println("Welcome to FizzBuzz\n");
		for (int i = 1; i <= 50; i++) {
			System.out.println(test.say(i));
		}

	}

}
