package fr.unistra.fizzbuzz;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class FizzBuzzJUnitParamsTest {

	private FizzBuzz fizzbuzz = new FizzBuzz();

	@Test
	@Parameters({"1", "2", "4", "7", "11", "13", "14"})
	public void returnsNumberForInputNotDivisibleByThreeOrFive(int number) {
		assertThat(fizzbuzz.convert(number)).isEqualTo("" + number);
	}

	@Test
	@Parameters({"9", "3", "66"})
	public void returnsFizzForNummbersDivisibleByThree(int number){
		assertThat(fizzbuzz.convert(number)).isEqualTo("FIZZ");
	}

	@Test
	@Parameters({"5", "10", "20"})
	public void returnsBUZZForNumbersDivisibleByFive(int number){
		assertThat(fizzbuzz.convert(number)).isEqualTo("BUZZ");
	}
	@Test
	@Parameters({"15", "30", "45", "60"})
	public void returnsFIZZBUZZForNumbersDivisibleByThreeAndFive(int number){
		assertThat(fizzbuzz.convert(number)).isEqualTo("FIZZBUZZ");
	}
}