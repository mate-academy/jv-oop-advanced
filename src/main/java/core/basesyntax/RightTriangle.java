package core.basesyntax;

public class RightTriangle extends Rectangle {
    public RightTriangle(String color, int firstLeg, int secondLeg) {
        super(color, firstLeg, secondLeg);
    }

    @Override
    public double getArea() {
        return super.getArea() / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: right_triangle, area: " + getArea()
                + " sq. units, firstLeg: " + getFirstLeg() + " units, secondLeg: "
                + getSecondLeg() + " units, color: " + getColor());
    }
}
