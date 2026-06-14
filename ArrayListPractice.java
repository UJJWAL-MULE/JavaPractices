import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

class ArrayListPractice{

  public static void main(String[] args) {

    List<Integer> num = new ArrayList<Integer>();

    num.add(22);
    num.add(3);
    num.add(24);    
    num.add(25);

     Iterator<Integer> a= num.iterator();
    System.out.println(a.next());
    System.out.println(num);

    
  }
}