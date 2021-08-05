package collection;

import java.util.ArrayList;

public class Demolist {

    public void demo(){
        // ArrayList obj_name=new ArrayList<Data_type>();

        ArrayList list=new ArrayList();//
        list.add("Ramavatar");
        list.add("Sumit");
        list.add("22.23");


        // printing display element
          // Advance loop
    for (Object var: list){
          System.out.println("Printing Value "+var);
      }
    }
    // Generics : Tell the Data_type of collection

    public void Generics() {
        // ArrayList<Data_type>Obj_name=new Arraylist<Data_type>();
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(55);
        marks.add(95);
        marks.add(45);
        marks.add(65);



        for (Integer var: marks){
            System.out.println("Printing marks "+var);

        }
    }

    public static void main(String[] args) {
        Demolist obj=new Demolist();
        obj.demo();
        obj.Generics();

    }
}
