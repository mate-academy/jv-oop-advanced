package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.print("Figure: ");
        System.out.print("Circle, ");
        System.out.print("Radius - " + radius);
        System.out.print(", Area - " + getArea());
        System.out.print(", Color: " + getColor().toLowerCase() + "\n");
    }
}

