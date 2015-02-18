/**
 * Classic Fizz Buzz Program.
 * Created by amytakayesu on 2/4/15.
 */
public class FizzBuzz {
  /**
   * Calls the computing method 100 times and sends number to send back either fizz or buzz.
   *
   * @param args not used
   */
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      System.out.println(fizzBuzzCompute(i));
    }
  }

  /**
   * Computes and prints appropriate fizz buzz output.
   *
   * @param num the number to compute fizz or buzz for.
   * @return String of either Fizz, Buzz, FizzBuzz, or num
   */
  public static String fizzBuzzCompute(int num) {
    String returnMe = "";
    if ((num % 3 == 0) && (num % 5 == 0)) {
      returnMe = ("FizzBuzz");
    }
    else if ((num % 3) == 0) {
      returnMe = ("Fizz");
    }
    else if ((num % 5) == 0) {
      returnMe = ("Buzz");
    }
    else {
      returnMe = String.valueOf(num);
    }
    return returnMe;
  }
}

