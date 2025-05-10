package core.basesyntax.figures;

public class Circle extends Figure {
    private final double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.round((radius * radius * Math.PI) * 10.0) / 10.0;
    }

    @Override
    public void draw() {
        System.out.println(
                "Figure: circle, area: "
                        + calculateArea()
                        + " sq. units, radius: "
                        + radius
                        + " units, color: "
                        + color);
    }
}
