public class Fizzbuzz {

  public String getResult(int number) {

    if(number % 3 == 0) {
      return "Fizz";
    } else {
      return String.valueOf(number);
    }
  }
}
