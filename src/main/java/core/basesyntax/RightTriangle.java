package core.basesyntax;

public class RightTriangle extends Figure {
    private static final int HALF_DIVIDER = 2;
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color.toLowerCase());
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return (firstLeg * secondLeg) / HALF_DIVIDER;
    }

    @Override
    public void draw() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Figure: right rectangle, area ")
                .append(String.format("%.2f", calculateArea()))
                .append(" sq. units, firstLeg ").append(firstLeg)
                .append(" units, secondLeg ").append(secondLeg)
                .append(" units, color: ").append(getColor());
        System.out.println(stringBuilder);
    }
}
