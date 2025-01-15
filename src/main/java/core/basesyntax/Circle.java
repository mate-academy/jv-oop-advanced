package core.basesyntax;

public class Circle extends Figure{
    public double radius;
    Circle (String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public void draw() {
        System.out.println("This figure is circle: color " + color + ", radius: " + roundToTwoDecimals(radius) + ", area:" + roundToTwoDecimals(getArea()) + ".");
    }
}
