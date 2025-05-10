package core.basesyntax;

public class RightTriangle extends Figure implements FigureArea, Draw {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public String toString() {
        return getDraw();
    }

    @Override
    public String getDraw() {
        return "RightTriangle: area: "
                + getArea()
                + " sq.units, "
                + "firstLeg: " + firstLeg
                + " units, "
                + "secondLeg: " + secondLeg
                + " units, "
                + "color: " + getColor();
    }
}
