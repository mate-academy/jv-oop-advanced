package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double first;
    private double second;
    private double height;

    public IsoscelesTrapezoid(String color, double first, double second, double height) {
        super(color);
        this.first = first;
        this.second = second;
        this.height = height;
    }

    @Override
    public double area() {
        return ((first + second) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + area()
                + " sq. units, a: " + first + " units, b: " + second + " units, h: " + height
                + " units, color: " + getColor().toLowerCase());
    }

    public double getA() {
        return first;
    }

    public double getB() {
        return second;
    }

    public double getH() {
        return height;
    }

    public void setA(double first) {
        this.first = first;
    }

    public void setB(double second) {
        this.second = second;
    }

    public void setH(double height) {
        this.height = height;
    }
}
