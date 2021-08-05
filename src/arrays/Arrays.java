package arrays;

import java.sql.Array;

public class Arrays{
    // SYNTAX of Array : Data_type [] variable_name={,,,,,}
    // Create method : Access_Specifier return type Method_name (parameter){}
    // SYNTAX of  Array : DataType [] variable_name={,,,}

    public void demo() {
     int number []={3,4,5,6,3};

     // Advance loop for (Data_type variable:array/collection)
        // Display normal loop
        for (int i=0;i<number.length;i++)
            System.out.println("Using normal loop "+number[i]);
      for (int var:number)

        System.out.println("inside advance loop "+var);


    }

    public static void main(String[] args) {
        Arrays Obj=new Arrays();
        Obj.demo();
    }



}