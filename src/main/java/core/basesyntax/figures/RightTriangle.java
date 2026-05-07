package core.basesyntax.figures;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public void draw() {
        StringBuilder info = new StringBuilder(
                String.format(BASIC_PRINT_INFO, "right triangle", getArea(), color)
        );

        info.append(", firstLeg: ").append(String.format("%.1f", firstLeg)).append(" units");
        info.append(", secondLeg: ").append(String.format("%.1f", secondLeg)).append(" units");
        System.out.println(info.toString());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
