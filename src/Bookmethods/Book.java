package Bookmethods;

public class Book {
    String name;
    int pageno;
    String writername;

    public void readbook(){
        System.out.println("This is read method");
    }

    public static void main (String[] args) {
        Book object=new Book();
        object.readbook();

    }


}
