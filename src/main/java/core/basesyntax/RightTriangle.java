package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

    public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * (firstLeg + secondLeg);
    }

    @Override
    public void draw() {
        System.out.println("RightTriangle: units, area: " + getArea() +
                " sq. units, firstLeg: " + firstLeg + " sq. units, side: "
                + secondLeg + " units, color: " + ColorSupplier.getRandomColor());
    }
}
