package core.basesyntax;

public class RightTriangle extends Figure implements Calculable, Drawable {
    private int firstLeg;
    private int secondLeg;
    private double area;

    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.area = areaCalculation();
    }

    @Override
    public double areaCalculation() {
        return firstLeg * secondLeg / 2F;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right triangle, area: " + this.area
                + " sq.units, firstLeg: " + this.firstLeg + " units, secondLeg: "
                + this.secondLeg + " units, color: " + getColor());
    }
}
