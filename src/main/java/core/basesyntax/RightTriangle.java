package core.basesyntax;

public class RightTriangle extends Figure{
    int firstLeg;
    int secondLeg;
    @Override
    public String draw() {
        return "rectangle, " +
                "area: " + getArea() + "sq. units, " +
                "firstLeg: " + firstLeg + "units, " +
                "secondLeg: " + secondLeg + "units, " +
                "color: " + color;
    }
    @Override
    public int getArea() {
        return (firstLeg + secondLeg) / 2;
    }
}
