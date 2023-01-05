package InnerClasses;

public class StaticInnerOR_Nested {
    public static void main(String[] args) {
        Computer.CPU.Calculate1();

        //recommended only if you need non static variables/methods
        Computer.CPU c = new Computer.CPU();
        c.Calculate2();
    }
}
class Computer{

    static class CPU{
        
        public static void Calculate1()
        {
            System.out.println("calculate1");
        }

        public void Calculate2()
        {
            System.out.println("calculate2");
        }
    }


}