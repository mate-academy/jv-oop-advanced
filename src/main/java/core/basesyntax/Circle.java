package core.basesyntax;

public class Circle extends Superclass {
    private final double radius;
    private final String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String getArea() {
        String end = " sq.units, radius: " + radius + " units, color: " + color;
        return "\nFigure: circle, area: " + (Math.PI * radius * radius) + end;
    }
}






