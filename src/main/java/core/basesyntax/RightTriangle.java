package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2.0;
    }

    @Override
    public void draw() {
        System.out.println(
                new StringBuilder().append("Figure: RightTriangle, area: ")
                        .append(this.getArea())
                        .append(" sq.units, firstLeg: ")
                        .append(firstLeg)
                        .append(" units, secondLeg: ")
                        .append(secondLeg)
                        .append(" units, color: ")
                        .append(this.getColor())
        );
    }
}
