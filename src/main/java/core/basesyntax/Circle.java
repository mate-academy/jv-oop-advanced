package core.basesyntax;

public class Circle extends Figure {
    private String color = super.getColor();
    private final int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getInfo() {
        return "Figure : Circle, Color : " + super.getColor()
                + ", Radius : " + radius
                + ", Area : " + getArea();
    }
}
