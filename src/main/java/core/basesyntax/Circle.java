package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String name, int radius, String color) {
        super(name, color);
        this.radius = radius;
        setArea(radius);
    }

    public String drawFigure() {
        return "Figure: " + this.getName()
                + ", area: " + this.getArea() + " sq.units, "
                + "color: " + this.getColor();
    }

    @Override
    public void setArea(double radius) {
        setArea(Math.PI * radius * radius);
    }
}
