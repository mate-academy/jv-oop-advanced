package core.basesyntax;

public class Circle extends Figure implements WithArea {

    private int radius;
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Figure: "
                + "circle, "
                + "area: " + getArea() + " sq. units, "
                + "radius: " + radius + " units, "
                + "color: " + color;
    }
}
