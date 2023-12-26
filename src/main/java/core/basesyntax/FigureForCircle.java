package core.basesyntax;

public abstract class FigureForCircle extends Figure {
    private int radius;

    public FigureForCircle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
