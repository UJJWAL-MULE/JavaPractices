public class enumPractice{
  public static void main(String s[]){
    System.out.println(Laptop.Asus + ": " + Laptop.Asus.price);
  }
}

enum Laptop{
  Macbook(100) , Lenovo(200) , Dell , Asus(99) ;

  int price ;

  private Laptop(){
    this.price = 500;
  }

  private Laptop(int price){
    this.price = price;
  }

}