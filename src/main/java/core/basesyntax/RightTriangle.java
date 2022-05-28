package core.basesyntax;

public class RightTriangle extends Figure implements GetArea, ToDrawFigure {
    private int base;

    public RightTriangle(int base, int height, Color color) {
        this.base = base;
        this.setHeight(height);
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return base * getHeight() / 2;
    }

    @Override
    public String toDraw() {
        return " Figure: RightTriangle, area: " + getArea()
                + " sq.units, base: " + base
                + " units, height: " + getHeight()
                + " units, color: " + getColor();
    }
}
