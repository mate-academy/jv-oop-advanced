package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(String color, int radius) {
        this.setName("circle");
        this.setColor(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        String drawString = FIGURE + getName() + AREA
                + String.format("%.1f", getArea()) + SQ_UNITS
                + "radius: " + radius + UNITS
                + "color: " + getColor();
        System.out.println(drawString);
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
