package InnerClasses;

public class InnerClass {
    public static void main(String[] args) {
        Car c = new Car();
        c.move();
        c.checkingMethod();


        System.out.println("====================");

        Car.Tyre t = c.new Tyre();
        //or
        //Car.Tyre t = new Car().new Tyre();
        t.changeTyre();
    }
}

class Car{
    private int speed =100;

    public void move(){
        System.out.println("Moving...");
    }
    public void checkingMethod(){
        Tyre t = new Tyre();
        t.changeTyre();// accessing inner class from outer class
    }

    public class Tyre{
        int psi=32;

        public void changeTyre(){
            System.out.println("Changing Tyres... and ... ");
            //move();
            System.out.println(speed);
        }
        //public static void method(){}//error ...
        //ONLY Static/Nested inner classes allow static Methods/Variables
    }

}//car ends
