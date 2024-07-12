package core.basesyntax;

public class Circle extends Figure {
    private int radius;
    private String color = getColor();

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    @Override
    public double areaCalculator() {
        return (radius * radius * Math.PI);
    }

    @Override
    public void draw() {
        System.out.println("Figure circle, area: " + areaCalculator()
                + ", radius: " + radius
                + ", color: " + color);
    }
}
