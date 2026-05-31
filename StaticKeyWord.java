public class StaticKeyWord {
  public static void main(String args[]) throws ClassNotFoundException{
    // Demo obj1 = new Demo();
    // Demo obj2 = new Demo("abhishek" , 23);
    // Demo.show(obj1);
    Class.forName("Demo");   // this will hep to execute static method of Class Demo  required exception handling
  }
} 

 class Demo{
  String name = "ujjwal";
  int number =1;
  static String gender = "Male";

  static {
    gender ="FEmale";
    System.out.println("gender changed");
  }

  Demo(){
    System.out.println(this.name + ":" + this.number );
  }
   Demo(String name , int number ){
    this.name= name;
    this.number = number;
    System.out.println(this.name + ":" + this.number );
  }

  static void show(Demo obj){
    System.out.println(obj.name + ":" + obj.number + " " + gender);  // use instance variable name and number by passing object as parameter other whise it will give an error
  }
}

