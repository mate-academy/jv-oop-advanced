package core.basesyntax;

public class RightTriangle extends Figure implements FigureArea {

    private int firstLeg;
    private int secondLeg;

    public RightTriangle() {

    }

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setColor(color);
    }

    @Override
    public double areaCalculator() {
        return (double) firstLeg * secondLeg / 2;
    }

    @Override
    public void drawInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: right triangle, area: ").append(areaCalculator())
                .append(" sq.units, first leg: ").append(firstLeg)
                .append(" units, second leg: ").append(secondLeg)
                .append(" units, color: ").append(getColor());
        System.out.println(stringBuilder);
    }
}
