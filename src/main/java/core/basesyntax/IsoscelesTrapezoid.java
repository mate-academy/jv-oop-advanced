package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstLeg;
    private int secondLeg;
    private int height;

        public IsoscelesTrapezoid(int firstLeg, int secondLeg, int height, ColorSupplier color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        int i = (firstLeg + secondLeg) * height / 2;
        return i;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + getArea() + " sq. units, firstLeg: " + firstLeg + " units, secondLeg: " + secondLeg + " units, color: " + getColor());

    }
}
