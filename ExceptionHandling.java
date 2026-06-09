class ExceptionHandling{

   int divide(int a1 , int a2){
    try{

      if(a2 == 0){
        throw new CustomError(1);
      }
      int res = a1/a2;
      return res;
    }
    catch(Exception e){
      System.out.println("exception is "+ e);
      return 0;
    }


    }

  public static void main(String args[]){
    ExceptionHandling obj = new ExceptionHandling();

   int p = obj.divide(2,0);
   System.out.println(p);

  }
}

class CustomError extends Exception{

  CustomError(int a){
    super(String.valueOf(a));
  }
}
