package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setColor(color);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder("Figure: ");
        stringBuilder.append("triangle, area: ")
                .append(getArea())
                .append(" sq.units, firstLeg: ")
                .append(firstLeg)
                .append(" sq.units, secondLeg: ")
                .append(secondLeg)
                .append(" color: ").append(getColor());
        System.out.println(stringBuilder);
    }
}
