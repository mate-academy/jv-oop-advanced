package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstSide;
    private int secondSide;

    public RightTriangle(String name, int firstSide, int secondSide, String color) {
        super(name, color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + this.getName()
                + ", area: " + this.getAria() + " sq.units, "
                + "color: " + this.getColor();
    }

    @Override
    public double getAria() {
        return firstSide * secondSide / 2;
    }
}
