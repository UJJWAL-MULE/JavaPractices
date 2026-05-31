class StackAndHeapConcept {
    public static void main(String[] args) {
      // int num = 10; // This variable is stored in the stack memory
      // String str ="Hello, World!"; // This variable is stored in the heap memory
      Calculator calc = new Calculator(); // This object is stored in the heap memory
      Calculator calc2 = new Calculator(); // This object is stored in the heap memory

      calc.calcNum = 20; // Modifying the calcNum variable of the first Calculator object
      System.out.println("calc.calcNum: " + calc.calcNum); // Output:
      System.out.println("calc2.calcNum: " + calc2.calcNum); // Output: 10 (calc2 is a different object with its own calcNum variable)

     int result = calc.add(5, 10); // This method call will use the add method of the Calculator class
     System.out.println("Result: " + result);

    }
}

class Calculator{
  int calcNum = 10;

  public int add(int a, int b){
    return a + b;
  }

}