package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.setColor(color);
    }

    public void draw() {
        System.out.printf("Figure: circle, radius: "
                + radius
                + ", area: "
                + this.calculateArea()
                + ", color: "
                + getColor().toLowerCase()
                + "\n"
        );
    }

    public double calculateArea() {
        double result = Math.PI * (radius * radius);
        return Math.ceil(result);
    }
}
