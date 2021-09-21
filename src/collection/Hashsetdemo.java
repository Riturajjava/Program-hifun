package collection;

import java.util.HashSet;

public class Hashsetdemo {

    // Syntax of function : Access_Specifier return_type Method_name (Parameter){}4

    public void namedemo() {
        // Hashset : Hashset <Data_type> object_name=new Hashset<data_type>();

        HashSet<String> name = new HashSet<>();
        name.add("Bhupendra");
        name.add("Vimal Goshowai");
        name.add("Sonu");
        name.add("Bhupendra");
        name.add("Vimal Goshowai");
        name.add("Sonu");


        // Display element for advance loop

        for (String var : name) {

            System.out.println("Print value " + var);
        }
    }

    public static void main(String[] args) {
        Hashsetdemo obj=new Hashsetdemo();
        obj.namedemo();
    }
}