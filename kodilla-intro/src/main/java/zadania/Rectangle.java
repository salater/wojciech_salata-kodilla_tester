package zadania;

public class Rectangle {
    private  int a;
    private  int b;

    public Rectangle(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int area() {
        int pole = a * b;
        return pole;
    }
}

