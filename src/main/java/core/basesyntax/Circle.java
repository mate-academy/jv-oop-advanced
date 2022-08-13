package core.basesyntax;

public class Circle implements Figure {

    private int radius;
    private String color;

    public Circle(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void toDraw() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Figure: circle, area: "
                + Math.PI * radius * radius
                + " sq.units, radius: "
                + radius
                + " units, color: " + color;
    }
}
