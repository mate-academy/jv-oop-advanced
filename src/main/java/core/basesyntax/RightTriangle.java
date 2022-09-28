package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        setColor(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public String name() {
        return "Right Triangle";
    }

    @Override
    public float getArea() {
        return (float) 0.5 * firstLeg * secondLeg;
    }

    @Override
    public String printInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(name()).append(", area: ")
                .append(getArea()).append(" units, first leg: ")
                .append(firstLeg).append(" units, second leg: ")
                .append(secondLeg).append(" color: ")
                .append(getColor());
        return sb.toString();
    }
}
