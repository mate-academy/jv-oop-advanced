package core.basesyntax;

public class Circle extends Figure implements AreaCalculator, Draw {
    private final double radius;

    public Circle(double radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        System.out.printf("Figure: circle, area %f sq. units, %s, color %s\n",
                calculateArea(), uniqueProperty(), color);
    }

    @Override
    public String uniqueProperty() {
        return String.format("Radius length: %f units", radius);
    }
}
