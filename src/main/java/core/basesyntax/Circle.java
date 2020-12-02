package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double findAreaFigure() {
        return 3.14 * radius * radius;
    }

    public int findDiameter() {
        return radius * 2;
    }

    @Override
    public String draw() {
        return "Figure: circle, area: " + findAreaFigure() + " sq. units, diameter: "
                + findDiameter() + " units, color: " + getColor();
    }
}
