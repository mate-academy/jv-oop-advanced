package core.basesyntax;

public class Circle implements Figure {
    int rad;
    double pi = 3.14;
    String color;

    public Circle(int rad, String color) {
        this.color = color;
        this.rad = rad;
    }

    @Override
    public double getArea() {
        return (pi * rad * rad);
    }

    @Override
    public void draw() {
        System.out.println("Circle, area: " + getArea() + " sq. units, color: "
                + color + ", radius: " + rad + " units");
    }
}
