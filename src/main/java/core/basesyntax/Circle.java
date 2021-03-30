package core.basesyntax;

public class Circle extends Figure implements State {
    private double radius;
    private String color;

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
            color = BLACK;
        } else {
            System.out.println("Radius cannot be less than 0 or equal 0");
        }
    }

    @Override
    public double countArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void drawFigure() {
        System.out.printf("Figure: Circle, area %f sq. units, %s, color %s\n",
                countArea(), uniqueProperty(), color);
    }

    public String uniqueProperty() {
        return String.format("Radius length: %f units", radius);
    }
}
