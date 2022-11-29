package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator, Drawing {
    private double a;
    private double b;
    private double h;
    public IsoscelesTrapezoid(double a, double b, double h, String color) {
        this.a = a;
        this.b = b;
        this.h = h;
        this.color = color;
    }
    public double getA() {
        return (a + b) / 2 * h;
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
    public double getH() {
        return h;
    }
    public void setH(double h) {
        this.h = h;
    }
    @Override
    public double getArea() {
        return (a + b) * 2 * h;
    }
    @Override
    public void draw() {
        System.out.println(this);
    }
    @Override
    public String toString() {
        return "IsoscelesTrapezoid{" +
                "a=" + a +
                ", b=" + b +
                ", h=" + h +
                ", color='" + color + '\'' +
                '}';
    }
}
