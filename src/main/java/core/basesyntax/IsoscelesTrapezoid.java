package core.basesyntax;

public class IsoscelesTrapezoid extends Rectangle {
    private int height;

    public IsoscelesTrapezoid(String color, int firstLeg, int secondLeg, int height) {
        super(color, firstLeg, secondLeg);
        this.height = height;
    }

    @Override
    public double getArea() {
        return height * (getFirstLeg() + getSecondLeg()) / 2.0;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles_trapezoid, area: " + getArea()
                + " sq. units, firstLeg: " + getFirstLeg() + " units, secondLeg: "
                + getSecondLeg() + " units, height: " + this.height + " units, color: "
                + getColor());
    }
}
