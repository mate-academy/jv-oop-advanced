package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle (Color color, double radius) {
        this.type = "Circle";
        this.color = color;
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("\n=================\ntype: "
                + this.type
                + "\ncolor: "
                + this.color
                + "\nradius: "
                + this.radius
                + "\narea: "
                + this.getArea());
    }
}
