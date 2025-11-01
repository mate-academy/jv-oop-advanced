package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, Color color) {
        this.color = color;
        this.firstLeg = firstLeg;
        this. secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return (double)(firstLeg * secondLeg) / 2.0;
    }

    @Override
    public String getDraw() {
        StringBuilder builder = new StringBuilder();
        builder.append("Figure: triangle, area ")
                .append(getArea()).append(" sq. units, firstleg: ")
                .append(firstLeg)
                .append(" units, secondleg: ")
                .append(secondLeg)
                .append(" units, color: ")
                .append(color);
        return builder.toString();
    }

}
