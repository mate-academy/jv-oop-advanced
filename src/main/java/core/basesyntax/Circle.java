package core.basesyntax;

public class Circle extends Figure {
    private double radius;

    public Circle(String name, int radius, String color) {
        super(name, color);
        this.radius = radius;
    }

    public String drawFigure() {
        return "Figure: " + this.getName()
                + ", area: " + this.getAria() + " sq.units, "
                + "color: " + this.getColor();
    }

    @Override
    public double getAria() {
        return Math.PI * radius * radius;
    }
}
