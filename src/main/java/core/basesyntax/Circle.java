package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        this.name = "circle";
        this.color = color;
        this.radius = radius;
    }

    @Override
    public void draw() {
        String drawString = FIGURE + name + AREA
                + String.format("%.1f", getArea()) + SQ_UNITS
                + "radius: " + radius + UNITS
                + "color: " + color;
        System.out.println(drawString);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
