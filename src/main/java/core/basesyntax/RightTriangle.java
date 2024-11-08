package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(Color color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: right triangle, ")
                .append("area: ").append(getArea()).append(" sq.units, ")
                .append("firstLeg: ").append(firstLeg).append(" units, ")
                .append("secondLeg: ").append(secondLeg).append(" units, ")
                .append("color: ").append(color.name());
        System.out.println(stringBuilder.toString());
    }

    @Override
    protected double getArea() {
        return firstLeg * secondLeg / 2.0;
    }
}
