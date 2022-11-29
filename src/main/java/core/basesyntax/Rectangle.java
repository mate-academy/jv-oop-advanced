package core.basesyntax;

public class Rectangle extends Figure implements AreaCalculator, Drawing {
    private double a;
    private double b;
    public Rectangle(double a, double b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }
    public double getA() {
        return a * b;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    @Override
    public double getArea() {
        return a * b;
    }
    @Override
    public void draw() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "b=" + b +
                ", color='" + color + '\'' +
                '}';
    }
}
