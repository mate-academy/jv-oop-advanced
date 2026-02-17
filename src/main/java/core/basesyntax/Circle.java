package core.basesyntax;

public class Circle extends Figure {
    int r;

    public Circle(int r, String color) {
        super(color);
        this.r = r;
    }

    @Override
    public double getArea() {
        return (3.14 * r * r);
    }

    @Override
    public void draw() {
        System.out.println("Circle, area: " + getArea() + " sq. units, color: " + color + ", radius: " + r);
    }
}
