package InnerClasses;

public class AnonymousInnerClass {
    public static void main(String[] args) {


        System.out.println("From Anonymous Inner Class");
        RallyCar rc = new RallyCar();
        rc.increasePower(100);

    }
}


class RallyCar {
    int speed = 100;

    public void Move() {
        System.out.println("Car is Moving...");
    }

    //==============================================================
    Turbo t = new Turbo() {
        public void TurboAddPower(int val) {
            System.out.println("Turbo power now = " + (val*3));
        }
    };
    //==============================================================

    public void increasePower(int val){
        t.TurboAddPower(val);
    }
}//car class ends


interface Turbo{
    void TurboAddPower(int val);
}
