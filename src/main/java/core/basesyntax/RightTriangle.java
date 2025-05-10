package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;
    private String color;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.color = color;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void toDraw() {
        System.out.println("Right Triangle [Color: " + color + ", FirstLeg: "
                + firstLeg + ", SecondLeg: " + secondLeg + ", Area: " + getArea() + "]");
    }
}
