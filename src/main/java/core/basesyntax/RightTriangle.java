package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: triangle, ")
                .append("area: ").append(getArea()).append(" sq.units, ")
                .append("firstLeg: ").append(firstLeg).append(" units, ")
                .append("secondLeg: ").append(secondLeg).append(" units, ")
                .append("color: ").append(getColor().name().toLowerCase());
        System.out.println(stringBuilder);
    }

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
