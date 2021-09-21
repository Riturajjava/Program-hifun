public class Overloading {

 // Access_specifier return_type Method_name(Parameter){}
 // Method overloading : A method same method but different parameter

    public void demo1(String a) {

        System.out.println("T "+a);


    }
  // Create a abject

    public static void main(String[] args) {
        Overloading obj=new Overloading();
        obj.demo1("Java "+"T");
    }







}
