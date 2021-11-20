package inharitance;

// method overriding will happen only in  parent and child method
public class Methodoverriding extends MethodOverloading {
    // Method Overriding : same method signature but different method body
   // Method Overriding : same method signature but different method body
    // Syntax : access_specifier return_type method_name(parameter){}

    @Override
    public void demo(){
        System.out.println("This is overridden method ");

    }

    public static void main(String[] args) {
        Methodoverriding obj=new Methodoverriding();
        //obj.demo();

        // interview
         MethodOverloading obj_parent=new MethodOverloading();// object parent class
         obj_parent.demo();

         MethodOverloading object_parent=new Methodoverriding();
         object_parent.demo();



    }

    //  whatever object is created at Runtime that class will get called..
}
