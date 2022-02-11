package core.basesyntax;

public class Сircle extends Figure implements FigureArea, Draw {
    private int radius;

    public Сircle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return getDraw();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getDraw() {
        return "Сircle: area: " +
                getArea() +
                " sq.units, " +
                "radius: " + radius +
                " units, " +
                "color: " + getColor();
    }

}
