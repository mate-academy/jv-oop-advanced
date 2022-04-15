package core.basesyntax;

public class Circle extends Figure implements Area {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toDraw() {
        return "Figure: circle, area: "
                + Math.ceil(getArea() * Math.pow(10, 1)) / Math.pow(10, 1)
                + " sq.units, radius: "
                + radius
                + " units, color: "
                + getColor().toLowerCase();
    }
}
