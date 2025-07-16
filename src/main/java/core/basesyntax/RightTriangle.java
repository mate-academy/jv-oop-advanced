package core.basesyntax;

public class RightTriangle extends Figure implements WithArea {

    private int firstLeg;
    private int secondLeg;
    @Override
    public double getArea() {
        return (double) (firstLeg * secondLeg) / 2;
    }

    @Override
    public String toString() {
        return "Figure: "
                + "right triangle, "
                + "area: " + getArea() + " sq. units, "
                + "firstLeg: " + firstLeg + " units, "
                + "secondLeg: " + secondLeg + " units, "
                + "color: " + color;

    }
}
