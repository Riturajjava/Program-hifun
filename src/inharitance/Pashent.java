package inharitance;

public class Pashent extends Doctor {
    // SYNTAX Method : Access_Specifier return_type method_name(parameter){}

    public void specialization(){
        System.out.println("My specialization ???");
    }


    public static void main(String[] args) {
        Pashent obj=new Pashent();
        obj.demo("Mohit");
        obj.age(28);
        obj.specialization();
    }
}
