package core.basesyntax;

public class Circle extends Figure {

    private final double radius;

    public Circle(String randomColor, double randomRadius) {
        super(randomColor);
        this.radius = randomRadius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle, area: " + getArea()
                + " sq. units, radius: " + radius
                + " units, color: " + getColor());
    }
}
