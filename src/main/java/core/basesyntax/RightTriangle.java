package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.setFirstLeg(firstLeg);
        this.setSecondLeg(secondLeg);
        this.setColor(color);
    }

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getAreaFigure() {
        return firstLeg * secondLeg / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right triangle, area: " + getAreaFigure()
                + " sq.units, firstLag: " + firstLeg + " units, secondLag: "
                + secondLeg + " units, color: " + getColor());
    }
}
