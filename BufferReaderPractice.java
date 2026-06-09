import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

class BufferReaderPractice {
  public static void main(String arg[]){
    InputStreamReader in  = new InputStreamReader(System.in);
    BufferedReader bf = new BufferedReader(in);
    try{
    String a= bf.readLine();
    int b = Integer.parseInt(a);
    System.out.println(b);

    Scanner sc = new Scanner(System.in);
     b =sc.nextInt();
    System.out.println(b);



    }
    catch(Exception e){
    }
  }
}