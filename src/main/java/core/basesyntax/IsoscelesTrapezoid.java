package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstLeg;
    private int secondLeg;
    private int height;

    public IsoscelesTrapezoid(String color, int firstLeg, int secondLeg, int height) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles trapezoid, area: " + String.format("%.2f", getArea())
                + " sq. units, firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg
                + " units, height: " + height + ", color: " + super.getColor().toLowerCase());
    }

    @Override
    public Double getArea() {
        return (double) (firstLeg + secondLeg) * height / 2;
    }
}
