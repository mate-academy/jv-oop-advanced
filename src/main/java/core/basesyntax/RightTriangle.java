package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle() {
    }

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: right triangle, area: ").append(getArea())
                .append(" sq.units, firstLeg: ").append(firstLeg)
                .append(" units, secondLeg: ").append(secondLeg)
                .append(" units, color: ").append(color.toLowerCase());
        return builder.toString();
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
