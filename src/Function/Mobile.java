package Function;

public class Mobile {

    String brand="SAMSUNG";
    int price=23000;
    int Ram=8;
    double camera=15.6;
    String modelno="F1 Pro";

    public static void main (String[] args) {

        Mobile object = new Mobile();
        System.out.println(object.brand);
        Mobile object1= new Mobile();
        Mobile object2=new Mobile();
        Mobile object3=new Mobile();
        Mobile object4=new Mobile();
        System.out.println(object.price);
        System.out.println(object.Ram);
        System.out.println(object.camera);
        System.out.println(object.modelno);

    }



}


