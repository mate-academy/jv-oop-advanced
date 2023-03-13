package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    public void drawInfo() {
        System.out.print("Figure: right triangle, area: ");
        System.out.printf("%.1f", getArea());
        System.out.println(" sq.units, firstLeg: " + firstLeg
                + " units, secondLeg: " + secondLeg + " units, color: " + getColor());
    }
}
