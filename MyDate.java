public class MyDate  
{
  private int day,month,year;

  public MyDate()
  {
   day=20;month=10;year=2020;
  }
  int getDay(){ return day;}
  void setDay(int d){ day=d;}  
  void display(){System.out.println(day+"/"+month+"/"+year);}
  static void show(){System.out.println("in static method");}
  public static void main(String args[])
  {
   System.out.println("this is change from remote repo");
   MyDate d= new MyDate();
   d.display();
   MyDate.show();
  }
}
