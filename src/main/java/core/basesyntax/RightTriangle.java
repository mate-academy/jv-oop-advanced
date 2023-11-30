package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, Color color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.setColor(color);
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg / 2;
    }

    @Override
    public void draw() {
        double area = getArea();
        System.out.println(new StringBuilder()
                .append("Figure: right triangle, ")
                .append("area: ").append(area).append(" sq. units, ")
                .append("first leg: ").append(firstLeg).append(" units, ")
                .append("second leg: ").append(secondLeg).append(" units, ")
                .append("color: ").append(this.getColor())
                .toString());
    }
}
