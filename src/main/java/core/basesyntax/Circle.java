package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle, area : " + getArea()
                + " sq. units, radius: " + radius + " units, color: " + color);
    }

    @Override
    protected String getFigureName() {
        return "Circle";
    }

}
