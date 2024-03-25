package core.basesyntax;

public class Square extends Figure {
    private int generalSide;

    public Square(int generalSide, Color color) {
        super(color);
        this.generalSide = generalSide;
    }

    @Override
    public double getArea() {
        return (double) generalSide * generalSide;
    }

    @Override
    public String getFigureInfo() {
        return null;
    }

    @Override
    public String toString() {
        return "Figure: square, area: " + String.format("%.1f", getArea())
                + " sq. units, general side: " + generalSide + " units, color: "
                + getColor().name().toLowerCase();
    }
}
