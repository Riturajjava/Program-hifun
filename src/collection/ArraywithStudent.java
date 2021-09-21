package collection;



import model.Student;

import java.util.ArrayList;

public class ArraywithStudent {

    public static void main(String[] args) {
        //ArrayList<Data_type>obj_name=new ArrayList<Data_Type>();
        // Student data Maintain
        ArrayList<Student>studentArrayList=new ArrayList<>();

        Student student=new Student("Depanshu",26,"SS");
        Student student1=new Student("Gambir",39,"CS");
        Student student2=new Student("Nikhal",36,"medic");
        Student student3=new Student("jhon",41,"IT");


        student.setName("Zahir");
        // Add Data to the List
        studentArrayList.add(student);
        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

  // display records or data of using Student for each loop
        for (Student var:studentArrayList){
            System.out.println("Printing name "+var.getName()+", " +var.getAge()+", "+var.getSapcelaizalion());
        }
    }

}
