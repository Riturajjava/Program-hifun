package collection;

import model.Student;

import java.util.HashSet;

public class HashsetStudent {


public  void  demo_Student(){


    HashSet<Student>studentname=new HashSet<>();
    Student student=new Student("ramu",25,"CS");
    Student student1=new Student("ramu",25,"CS");

    // add record
    studentname.add(student);
    studentname.add(student1);

    for (Student var:studentname){

        System.out.println("Print List " + var.getName()+ " " +var.getAge()+" "+var.getSapcelaizalion());

    }

}

    public static void main(String[] args) {
        HashsetStudent obj=new HashsetStudent();
        obj.demo_Student();
    }
}
