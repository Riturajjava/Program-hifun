package inharitance;

public class Doctor {

        public void demo1(String name){
        System.out.println("I am doctor "+name);
    }
    public void age1(int s){
        System.out.println("I am this year old "+s);

    }

    public static void main(String[] args) {
        Doctor obj=new Doctor();
        obj.demo1("Rajan");
        obj.age1(29);
    }
}
