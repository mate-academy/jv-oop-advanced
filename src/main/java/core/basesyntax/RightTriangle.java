package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(int firstLeg, int secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: right triangle, area: ");
        stringBuilder.append(getArea());
        stringBuilder.append(" units, first leg: ");
        stringBuilder.append(firstLeg);
        stringBuilder.append(" units, second leg: ");
        stringBuilder.append(secondLeg);
        stringBuilder.append(" units, color: ");
        stringBuilder.append(getColor());
        System.out.println(stringBuilder.toString());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
