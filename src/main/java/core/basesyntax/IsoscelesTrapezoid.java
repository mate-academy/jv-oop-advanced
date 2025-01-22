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
    public double getArea() {
        return height * (this.firstLeg + this.secondLeg) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles_trapezoid, area: " + getArea()
                + " sq. units, firstLeg: " + this.firstLeg + " units, secondLeg: "
                + this.secondLeg + " units, height: " + this.height + " units, color: "
                + getColor());
    }
}
