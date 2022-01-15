package core.basesyntax;

public class RightTriangle extends Rectangle {
    /*
    Right triangle is a half-area object from rectangle.
    And the legs of the triangle correspond to sides A and B of the rectangle.
     */

    RightTriangle(Color color,int firstLeg, int secondLeg) {
        super(color, firstLeg, secondLeg);
    }

    @Override
    public double getArea() {
        return 0.5 * super.getArea();
    }

    @Override
    public String toString() {
        return "Figure: rightTriangle, "
                + "area: " + getArea() + " sq.units, "
                + "firstLeg: " + getSideA() + " units, "
                + "secondLeg: " + getSideB() + " units, "
                + "color: " + getColor().toString().toLowerCase();
    }
}
