package core.basesyntax;

public class RightTriangle extends Figure implements AreaCalculator, InformationAboutFigure {
    private final String name = "right triangle";
    private int firstLeg;
    private int secondLeg;

    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }

    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return this.firstLeg * this.secondLeg * 0.5;
    }

    @Override
    public void figureInfo() {
        System.out.println(this.name + ", area: "
                + getArea() + " sq.units, "
                + this.firstLeg + " units, "
                + this.secondLeg + " units, color: "
                + getColor()
        );
    }
}
