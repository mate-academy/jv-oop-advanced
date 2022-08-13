package core.basesyntax;

public class Circle extends Figure {

    {
        radius = 10;
        setColor("White");
    }

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Figure: "
                + "circle, "
                + "area: " + String.format("%.2f", calculateArea()) + " sq.units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor().toLowerCase();
    }
}
