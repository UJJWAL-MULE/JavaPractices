public class Inheritance {
  public static void main(String s[]){
    C obj = new C();
        obj.showC();

    obj.showB();
    obj.showA();

  } 
  
}

class A{
  public A(){
    System.out.println("A const");
  }
  void showA(){
    System.out.println("A");
  }

}

class B extends A{   
    public B(){
    System.out.println("B const");
  }           // single level inheitance
void showB(){
  System.out.println("B");
}
}

class C extends B{   // multi level inheritance C to B -> B to A
    public C(){
    System.out.println("C const");
  }
  void showC(){
    System.out.println("C");
  }
}
