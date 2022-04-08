package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private int firstLeg;
    private int secondLeg;

    public IsoscelesTrapezoid(String color, int firstLeg, int secondLeg) {
        super(color);
        this.secondLeg = secondLeg;
        this.firstLeg = firstLeg;
    }

    @Override
    public double getArea() {
        return Math.sqrt(firstLeg * secondLeg) * (firstLeg + secondLeg) / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, " + "area: " + getArea()
                + " sq.units, " + "firstLeg: " + firstLeg + " units, "
                + "secondLeg: " + secondLeg + " units, " + "color: " + color);
    }
}
