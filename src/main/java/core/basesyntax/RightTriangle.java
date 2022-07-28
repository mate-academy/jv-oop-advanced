package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        setColor(color);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5f;
    }

    @Override
    public String draw() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Figure: Right triangle, ").append("area: ")
                .append(Double.valueOf(getArea()).toString()).append(" sq.units, first leg: ")
                .append(Integer.valueOf(firstLeg).toString()).append(" units, second leg: ")
                .append(Integer.valueOf(secondLeg).toString()).append(" units, color: ")
                .append(getColor()).toString();
    }
}
