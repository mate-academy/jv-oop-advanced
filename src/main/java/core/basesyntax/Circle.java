package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public double getArea() {
        return Math. round(Math.PI * radius * radius * 10) / 10;
    }

    @Override
    public String draw() {
        return "circle, area: " + getArea()
            + " sq.units, radius: " + radius + " units, color: " + getColor().toLowerCase();
    }
}
