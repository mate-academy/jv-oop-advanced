package core.basesyntax;

public class Circle extends Figure implements Draw, FigureArea {
    private int radius;

    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getDraw() {
        return "Сircle: area: "
                + getArea()
                + " sq.units, "
                + "radius: " + radius
                + " units, "
                + "color: " + getColor();
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return getDraw();
    }
}
