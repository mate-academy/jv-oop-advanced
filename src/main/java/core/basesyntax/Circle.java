package core.basesyntax;

public class Circle extends Figure implements State {
    private final double radius;
    private String color;

    public Circle(double radius) {
        this.radius = radius;
        color = BLACK;

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
    public void setColor(String color) {
        this.color = color;
    }

    public String uniqueProperty() {
        return String.format("Radius length: %f units", radius);
    }
}
