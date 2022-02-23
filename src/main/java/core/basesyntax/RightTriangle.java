package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: right triangle, area: ")
                .append(getArea())
                .append(" sq.units, first leg: ")
                .append(firstLeg)
                .append(" sq.units, second leg: ")
                .append(secondLeg)
                .append(" units, color: ")
                .append(getColor());
        System.out.println(builder.toString());
    }
}
