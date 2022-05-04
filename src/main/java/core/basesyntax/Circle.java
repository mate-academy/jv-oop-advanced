package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, String color) {
        this.radius = radius;
        setColor(color);
    }

    @Override
    public double getFigureArea() {
        return Math. round(Math.PI * radius * radius * 10) / 10;
    }

    @Override
    public String getFigureInfo() {
        return "circle, area: " + getFigureArea()
            + " sq.units, radius: " + radius + " units, color: " + getColor().toLowerCase();
    }
}
