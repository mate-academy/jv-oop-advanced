package core.basesyntax;

public class Circle extends Figure {
    private double radius;
    private Color color;

    public Circle(double radius, Color color) {

        this.radius = radius;
        this.color = color;
    }

    @Override
    public double getArea() {
        area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public String drawFigure() {
        System.out.println("Figure: circle, "
                + "area: " + Math.floor(area) + " sq.units, "
                + "radius: " + radius + " units"
                + ", color: " + color.toString().toLowerCase());
        return null;
    }
}
