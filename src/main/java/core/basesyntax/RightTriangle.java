package core.basesyntax;

public class RightTriangle extends Figure {
    private final int firstLeg;
    private final int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double area() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public StringBuilder getSizes() {
        return super.getSizes()
                .append("firstLeg: ")
                .append(firstLeg)
                .append(" units, secondLeg: ")
                .append(secondLeg)
                .append(" units");
    }
}
