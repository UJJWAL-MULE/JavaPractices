public class INhertitanceBySuper {
  
  public static void main(String s[]){
    B obj = new B(5);
     

  } 
  
}

class A{
  public A(){
    this(5);
    System.out.println("A const");
  }
  public A(int n){
    super();
    System.out.println("A int");
  }
  void showA(){
    System.out.println("A");
  }

}

class B extends A{   
    public B(){
      super();
    System.out.println("B const");
  }    
  
   public B(int n){
    this();
    System.out.println("B int");
  }
void showB(){
 
  System.out.println("B");
}
}


