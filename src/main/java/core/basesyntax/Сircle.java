package core.basesyntax;

public class Сircle extends Figure implements FigureArea, Draw {
    private int radius;

    public Сircle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public String getDraw() {
        return null;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(radius,2);
    }
}
