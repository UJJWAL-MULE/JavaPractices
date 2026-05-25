public class ClassAndObjectDemo
{
  public static void main(String args[]){

    int result;
    Calculator calc = new Calculator();

    result = calc.add(10, 20);
    System.out.println("Addition: " + result);

    result = calc.subtract(20, 10);
    System.out.println("Subtraction: " + result);

    result = calc.multiply(10, 20);
    System.out.println("Multiplication: " + result);

    result = calc.divide(20, 10);
    System.out.println("Division: " + result);
  }
}

class Calculator {

   int add (int a, int b){
    return a + b;
  }

  public int subtract (int a, int b){
    return a - b;
  }

  public int multiply (int a, int b){
    return a * b;
  }
  public int divide (int a, int b){
    return a / b;
  }
}