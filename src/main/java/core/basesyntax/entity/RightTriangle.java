package core.basesyntax.entity;

public class RightTriangle extends Figure {

    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println(new StringBuilder()
                .append("Figure: triangle, area:")
                .append(String.format("%.1f", getArea()).replace(',', '.'))
                .append(", firstLeg: ")
                .append(String.format("%.1f", firstLeg).replace(',', '.'))
                .append(" units, secondLeg: ")
                .append(String.format("%.1f", secondLeg).replace(',', '.'))
                .append(" units, color: ").append(this.color).toString());
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }
}
