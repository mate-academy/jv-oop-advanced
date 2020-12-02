package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        super(Math.PI * radius * radius, color);
        this.radius = radius;
    }

    public void printInfo() {
        System.out.println("Shape: circle, area: " + getArea() + " sq. units, radius: "
                + radius + " units, color: " + getColor());
    }
}
