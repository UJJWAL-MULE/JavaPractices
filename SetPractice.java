import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class SetPractice {
    public static void main(String args[]){

      Collection<Integer> a = new HashSet<Integer>();
      TreeSet<Integer> b = new TreeSet<Integer>();
      a.add(33);
      a.add(2);
      a.add(1);
      b.add(3);
      b.add(33);
      b.add(2);
      b.add(1);
      b.add(3);
      System.out.println(a + " " + b);


    }
}
