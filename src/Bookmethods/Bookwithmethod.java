package Bookmethods;

import com.sun.org.apache.xpath.internal.objects.XBoolean;

import java.security.SecureRandom;

public class Bookwithmethod {

    // properties
    String name;
    int page;
    String writerName;

    // method1;
    /* todo Member function method -- cap */

    public void readbook() {
        System.out.println("This is read Method...");
    }
    public void writebook(){
        System.out.println("This is write Method...");
    }



    public static void main (String[] args) {
        Bookwithmethod object=new Bookwithmethod();
        object.readbook();
        object.writebook();
    }





}
