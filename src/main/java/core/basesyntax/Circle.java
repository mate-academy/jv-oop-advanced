package core.basesyntax;

public class Circle extends AbstractFigure {

    private final double radius;

    public Circle(Colors color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: Circle area: " + calculateArea() + " sq. units, radius: "
                + radius + " units, color: " + color.name());
    }
}
