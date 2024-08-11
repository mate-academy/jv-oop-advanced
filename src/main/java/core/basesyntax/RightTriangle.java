package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLegLength;
    private int secondLegLength;

    public RightTriangle(int firstLegLength, int secondLegLength, String color) {
        this.firstLegLength = firstLegLength;
        this.secondLegLength = secondLegLength;
        super.setFigureColor(color);
    }

    public void setFirstLegLength(int firstLegLength) {
        this.firstLegLength = firstLegLength;
    }

    public void setSecondLegLength(int secondLegLength) {
        this.secondLegLength = secondLegLength;
    }

    public int getFirstLegLength() {
        return firstLegLength;
    }

    public int getSecondLegLength() {
        return secondLegLength;
    }

    @Override
    public double getArea() {
        return (firstLegLength * secondLegLength) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle"
                + ", area: " + getArea() + " sq.units"
                + ", first base length: " + firstLegLength
                + ", second base length: " + secondLegLength
                + ", color: " + super.getFigureColor());
    }
}
