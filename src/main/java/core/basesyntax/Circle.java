package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        setColor(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println(System.lineSeparator()
                + "Circle with area of " + calculateArea() + " sq. units"
                + System.lineSeparator()
                + " color: " + super.getColor()
                + System.lineSeparator()
                + "radius:" + radius
                + System.lineSeparator());
    }
}
