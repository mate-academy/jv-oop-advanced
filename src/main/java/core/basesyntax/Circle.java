package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(Color color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double areaFigure() {
        return 3.14 * radius * radius;
    }

    public int diameter() {
        return radius * 2;
    }

    @Override
    public String drawn() {
        return "Figure: circle, area: " + areaFigure() + " sq. units, diameter: "
                + diameter() + " units, color: " + getColor();
    }
}
