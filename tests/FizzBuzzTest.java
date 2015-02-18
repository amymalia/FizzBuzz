import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the fizz buzz class.
 *
 * Created by amytakayesu
 */
public class FizzBuzzTest {
  /**
   * Tests the fizz buzz class with four different upperbounds.
   *
   * @throws Exception in case of failure
   */
  @Test
  public void testFizzBuzzCompute() throws Exception {
    assertEquals("Fizz", FizzBuzz.fizzBuzzCompute(9));
    assertEquals("Buzz", FizzBuzz.fizzBuzzCompute(10));
    assertEquals("FizzBuzz", FizzBuzz.fizzBuzzCompute(15));
    assertEquals("8", FizzBuzz.fizzBuzzCompute(8));
  }
}