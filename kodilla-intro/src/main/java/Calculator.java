public class Calculator {
    static final double PI = 3.1415927;
    static int counter = 0;
    public Calculator(){
    counter++;
        }

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double circleArea(double r) {
        String name = CalcUserDialogs.getUserName();
        System.out.println("Hi, " + name + ". Thank you for using our software.");
        return PI * r * r;
    }

    public double circlePerimetr(double r) {
        return 2 * PI * r;
    }
}


