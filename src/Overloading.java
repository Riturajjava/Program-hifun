public class Overloading {

 // Access_specifier return_type Method_name(Parameter){}
 // Method overloading : A method same method but different parameter

    public void demo(String a) {

        System.out.println("Welcome "+a);}
       public void demo(String a,int b){
        System.out.println(a + b);}
        public void demo(int a ,int b ){
        System.out.println("Welcome  "+a+" " +b);
}


  // Create a object

    public static void main(String[] args) {
        Overloading obj=new Overloading();
        obj.demo("Java "+"T");
        obj.demo("Upcsm ",22);
        obj.demo(22,11);
    }







}
