package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(Color color, double radius) {
        super(color, FigureType.CIRCLE);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getFigureType().getValue() + ", area: " + calculateArea()
                + ", radius: " + radius + " units, color: " + getColor());
    }
}
