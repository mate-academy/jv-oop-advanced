package core.basesyntax;

public class RightTriangle extends Figure {
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
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getPrint() {
        return "Figure: right triangle, area: " + getArea() + "sq. units, "
                + " firstLeg: " + firstLeg + " units, "
                + " secondLeg: " + secondLeg + " units, " + "color: " + getColor();
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
