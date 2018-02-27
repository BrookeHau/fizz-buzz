package fizzbuzz;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz fizz = new FizzBuzz();

	@Test
	public void printFizz() {
		String check = fizz.say(3);
		assertThat(check, is("Fizz"));
	}
	
	@Test
	public void otherMultipleOfThree() {
		String check = fizz.say(9);
		assertThat(check, is("Fizz"));
	}
	
	@Test
	public void multipleOfFive() {
		String check = fizz.say(5);
		assertThat(check, is("Buzz"));
	}
	
	@Test
	public void otherFiveMultiple() {
		String check = fizz.say(10);
		assertThat(check,is("Buzz"));
	}
	
	@Test
	public void fizzBuzz() {
		String check = fizz.say(15);
		assertThat(check, is("FizzBuzz"));
	}
	
	@Test 
	public void additionalTest() {
		String check = fizz.say(25);
		assertThat(check, is("Buzz"));
	}
	
	@Test
	public void moreTest() {
		String check = fizz.say(60);
		assertThat(check, is("FizzBuzz"));
	}
	
	@Test 
	public void test() {
		String check = fizz.say(-40);
		assertThat(check, is("Buzz"));
	}
	
	@Test
	public void test2() {
		String check = fizz.say(47);
		assertThat(check, is("The number is neither a multiple of three or five"));
	}
}
