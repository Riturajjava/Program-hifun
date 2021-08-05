package inharitance;

public class Doctor {

        public void demo(String name){
        System.out.println("I am doctor "+name);
    }
    public void age(int s){
        System.out.println("I am this year old "+s);

    }

    public static void main(String[] args) {
        Doctor obj=new Doctor();
        obj.demo("Rajan");
        obj.age(29);
    }
}
