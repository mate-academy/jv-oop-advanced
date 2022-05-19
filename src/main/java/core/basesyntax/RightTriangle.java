package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    @Override
    public double getArea() {
        return (firstLeg * secondLeg) / 2;
    }

    @Override
    public void drawInfo() {
        System.out.println("Right Triangle. First Leg: " + firstLeg + ". Second Leg: " + secondLeg
                + ". Area: " + getArea() + ".");
    }
}
