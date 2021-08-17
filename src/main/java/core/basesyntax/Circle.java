package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        super("Circle", color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String draw() {
        return "Figure: " + getFigureName() + ", area: " + getArea() + " sq. units, radius length: "
                + radius + " units, color: " + getFigureColor();
    }
}
