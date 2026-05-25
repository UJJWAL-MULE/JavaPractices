class OverLoadingCOncept
{
  public int add(int a, int b){
    return a + b;
  }
  public int add(int a, int b, int c){
    return a + b + c;
  }
  public double add(double a, double b){
    return a + b;
  }
  
  public static void main(String args[]){
    OverLoadingCOncept obj = new OverLoadingCOncept();
    System.out.println("Addition of 2 numbers: " + obj.add(10, 20));
    System.out.println("Addition of 3 numbers: " + obj.add(10, 20, 30));
    System.out.println("Addition of double numbers: " + obj.add(10.5, 20.5));
  }

}