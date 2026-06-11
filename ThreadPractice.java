class ThreadPractice{

  public static void main(String arg[]){
      A obj1 = new A();
      B obj2 = new B();

      obj1.start();
      obj2.start();

  }
}

class A extends Thread {
  public void run(){
    for(int i = 0 ; i< 10 ;i++){
    System.out.println("classA");
    try {
          Thread.sleep(1000);

    } catch (Exception e) {
      // TODO: handle exception
    }

    }
  }
}
class B extends Thread{
  public void run(){
    for(int i = 0 ; i< 10 ;i++){
         System.out.println("classB");
          try {
          Thread.sleep(1000);

    } catch (Exception e) {
      // TODO: handle exception
    }
 
    }
  }
}