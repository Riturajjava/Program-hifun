package collection;

import java.util.ArrayList;

public class Arraylist {

    public void demo(){
        // ArrayList Obj_name=new ArrayList();
        ArrayList list=new ArrayList();
        list.add("Java");
        list.add("Honda");
        list.add("22");
        // Display element for loop
        for (Object var:list){
            System.out.println("Printing list.."+var);
        }
    }
    // GENERICS : Tell the dataType of collection
  public void generics(){
        // ArrayList<DataType>object_name=new ArrayList<>();
       ArrayList<Integer>listofmarks=new ArrayList<>();
       listofmarks.add(0,22);
       listofmarks.add(1,66);
       listofmarks.add(54);

       for (Integer var:listofmarks){
           System.out.println("Printing list "+var);
       }
  }


    public static void main(String[] args) {
        Arraylist object=new Arraylist();
        object.demo();
        object.generics();
    }
}
