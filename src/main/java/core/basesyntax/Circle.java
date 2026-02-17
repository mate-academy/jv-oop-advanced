package core.basesyntax;

public class Circle extends Figure {
    int r;
    int rad;

    public Circle(int rad, String color) {
        super(color);
        this.rad = rad;
    }

    @Override
    public double getArea() {
        return (3.14 * rad * rad);
    }

    @Override
    public void draw() {
        System.out.println("Circle, area: " + getArea() + " sq. units, color: " + color + ", radius: " + r);
    }
}
