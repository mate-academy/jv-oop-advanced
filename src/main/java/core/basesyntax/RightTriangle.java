package core.basesyntax;

public class RightTriangle extends Figure{
    int firstLeg;
    int secondLeg;
    public void setFirstLeg(int firstLeg) {
        this.firstLeg = firstLeg;
    }
    public void setSecondLeg(int secondLeg) {
        this.secondLeg = secondLeg;
    }
    public int getFirstLeg() {
        return firstLeg;
    }
    public int getSecondLeg() {
        return secondLeg;
    }
    @Override
    public void draw() {
        System.out.println( "rectangle, " +
                "area: " + getArea() + " sq. units, " +
                "firstLeg: " + firstLeg + " units, " +
                "secondLeg: " + secondLeg + " units, " +
                "color: " + getColor());
    }
    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }
}
