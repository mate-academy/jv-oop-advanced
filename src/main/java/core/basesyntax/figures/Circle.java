package core.basesyntax.figures;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle{color: "
                + getColor()
                + "; radius: "
                + radius
                + "; area: "
                + getArea()
                + "}");
    }
}
