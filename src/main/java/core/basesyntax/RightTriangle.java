package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator, Drawing {
    private double a;
    private double b;
    public RightTriangle(double a, double b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }
    public double getA() {
        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
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
        return a * b / 2;
    }
    @Override
    public void draw() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "RightTriangle{" +
                "a=" + a +
                ", b=" + b +
                ", color='" + color + '\'' +
                '}';
    }
}
