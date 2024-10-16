package core.basesyntax;

public class Circle extends Figure {
    private final double radius;

    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: circle, area: " + calculateArea() + " sq. units, radius: "
                + radius + "units, color: " + getColor()));
    }
}
