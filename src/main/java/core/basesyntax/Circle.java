package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        final int power = 2;
        return Math.PI * Math.pow(radius, power);
    }

    @Override
    public void draw() {
        System.out.println("Figure: circle," + " area: " + calculateArea() + " sq units, "
                            + " radius: " + radius + " unit," + " color: " + color);
    }
}
