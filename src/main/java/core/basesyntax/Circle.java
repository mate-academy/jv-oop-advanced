package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        System.out.print("Figure: circle, area "
                + calculateArea() + " sq. units, radius: "
                + radius + " units, color: " + getColor());
    }
}
