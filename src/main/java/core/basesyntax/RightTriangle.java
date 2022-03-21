package core.basesyntax;

public class RightTriangle extends Figure {
    private int leg;

    public RightTriangle(String nameFigure, int leg, String colorFigure) {
        super(nameFigure, colorFigure);
        this.leg = leg;
    }

    @Override
    public double getArea() {
        return (leg * leg) * 0.5;
    }

    @Override
    public String toString() {
        return "Figure"
                + ": right triangle"
                + ", area: " + getArea() + " sq.units"
                + ", leg: " + leg + " units"
                + ", color: " + getColorFigure();
    }
}
