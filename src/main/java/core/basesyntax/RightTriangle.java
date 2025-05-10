package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void toDraw() {
        StringBuilder str = new StringBuilder();
        System.out.println(str
                .append("Figure: triangle, area: ")
                .append(getArea())
                .append("sq. units, firstLeg: ")
                .append(firstLeg)
                .append("units,secondLeg: ")
                .append(secondLeg)
                .append("units,color: ")
                .append(color));
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
