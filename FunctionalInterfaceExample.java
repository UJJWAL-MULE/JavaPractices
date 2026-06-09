public class FunctionalInterfaceExample {
public static void main(String a[]){
A obj = (b)->{
System.out.println(b);
};
  obj.demo(5);
}

  
}

@FunctionalInterface
interface A{
  void demo(int a);
}