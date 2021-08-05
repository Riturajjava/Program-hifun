package inharitance;

public class MethodOverloading {
    //SYNTAX METHOD : Access_Specifier return_Type method_name(parameter){}

    public void demo(){
        System.out.println("This is demo method form parent ");
    }
    // Method Overloading : same method name but different parameter

    public void demo(String name){
        System.out.println("This is overload method "+name);
    }
    // Method Overloading : same method name but different parameter
    // Method Overloading : same method name but different parameter

   // again overload same method
    public void demo(String name, int a) {
        System.out.println("This is again overload method " + a+"," +name);
    }

    public static void main(String[] args) {
        MethodOverloading obj=new MethodOverloading();
        obj.demo();
        obj.demo("Shivam ");
        obj.demo("Sumit ", 22);

    }
}
