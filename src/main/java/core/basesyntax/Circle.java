package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        setColor(color);

    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: circle, area: " + calculateArea()
                + " square units, radius: " + radius + " units, color: " + getColor());
    }
}
