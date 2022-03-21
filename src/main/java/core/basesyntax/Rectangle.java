package core.basesyntax;

public class Rectangle extends Figure {
    private int width;
    private int height;

    public Rectangle(String nameFigure, int width, int height, String colorFigure) {
        super(nameFigure, colorFigure);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Figure"
                + ": rectangle"
                + ", area: " + getArea() + " sq.units"
                + ", firstLeg: " + width + " units"
                + ", secondLeg: " + height + " units"
                + ", color: " + getColorFigure();
    }
}
