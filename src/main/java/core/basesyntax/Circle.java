package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle" + ", area: " + area() + ", radius: " + radius + ", unit"
                            + "s" + ", color: " + color);
    }
}
