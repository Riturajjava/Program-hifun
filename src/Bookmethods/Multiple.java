package Bookmethods;

public class Multiple {

    private static String[] args;

    public void mul(){
        System.out.println("This is Multiple Method...."); }
  public void dividedMethod(){
  System.out.println("This is DividedMethod....");
  }
    public static void main (String[] args) {
        Multiple object=new Multiple();
        object.mul();
        object.dividedMethod();



        for (int i = 1; i <=10; i++) {
            System.out.println("This is for loop...."  + i );

        }
       for (int o=1;o<=10;o++)
        System.out.println(2*o);
    }


}
