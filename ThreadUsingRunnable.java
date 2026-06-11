public class ThreadUsingRunnable {
  public static void main(String args[]){

    Runnable obj = ()->{
for(int i = 0 ; i< 10 ;i++){
    System.out.println("classA");
    try {
          Thread.sleep(1000);

    } catch (Exception e) {
      // TODO: handle exception
    }

    }      }
    ;

    Runnable obj2 = ()->{
        
for(int i = 0 ; i< 10 ;i++){
    System.out.println("classB");
    try {
          Thread.sleep(1000);

    } catch (Exception e) {
      // TODO: handle exception
    }

    }  } ;
    
  
    Thread t1 = new Thread(obj);
    Thread t2 = new Thread(obj2);

    t1.start();
    t2.start();

  
  }
  
}

