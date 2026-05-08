package core.basesyntax;

public class RightTriangle extends Figure {
    private Double firstLeg;
    private Double secondLeg;

    public RightTriangle(Double firstLeg, Double secondLeg, String color) {
        super(color, FigureType.RIGHT_TRIANGLE);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    public Double getFirstLeg() {
        return firstLeg;
    }

    public void setFirstLeg(Double firstLeg) {
        this.firstLeg = firstLeg;
    }

    public Double getSecondLeg() {
        return secondLeg;
    }

    public void setSecondLeg(Double secondLeg) {
        this.secondLeg = secondLeg;
    }

    @Override
    public Double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + getArea()
                + " sq. units, first leg: " + firstLeg
                + " units, second leg: " + secondLeg
                + " units, color: " + getColor() + "\n");
    }
}
