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
    public void draw() {
        System.out.println(
                new StringBuilder("Figure: right triangle, ")
                        .append("area: ")
                        .append(String.format("%.1f", getArea()))
                        .append(" sq.units, firstLeg: ")
                        .append(firstLeg)
                        .append(" units, secondLeg: ")
                        .append(secondLeg)
                        .append(" units, color: ")
                        .append(getColor().toLowerCase())
        );
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
