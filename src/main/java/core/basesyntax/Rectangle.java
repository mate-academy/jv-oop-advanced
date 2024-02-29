package core.basesyntax;

public class Rectangle extends RightTriangle {

    public Rectangle(double firstLeg, double secondLeg, String color) {
        super(firstLeg, secondLeg, color);
    }

    @Override
    public String toString() {
        return "Figure : right thiangle, "
                + "area: " + getArea()
                + " sq. units, firstLeg = "
                + getFirstLeg() + ", secondLeg = "
                + getSecondLeg()
                + " units, color: '"
                + getColor() + "'";
    }

    @Override
    public double getArea() {
        return getFirstLeg() * getSecondLeg();
    }
}
