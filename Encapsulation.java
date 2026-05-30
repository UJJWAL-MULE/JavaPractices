public class Encapsulation {
  
public static void main ( String args[])
{
    Human obj = new Human();

    obj.setAge(25);
    obj.setName("Ujjwal");
  System.out.println(obj.GetName() + ": " + obj.GetAge());
}
}

class Human {
  private int age = 5;
  private String name ;

  public int GetAge(){
    return age;
  }

  public String GetName(){
    return name;
  }

  public void setName( String updatedName){
    this.name = updatedName;
  }

   public void setAge( int newAge){
    this.age = newAge;
  }
}
