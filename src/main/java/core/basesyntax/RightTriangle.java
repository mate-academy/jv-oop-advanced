package core.basesyntax;

public class RightTriangle extends Figure {
    private double firstLeg;
    private double secondLeg;

   public RightTriangle(String color, double firstLeg, double secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return 0.5 * firstLeg * secondLeg;
    }

    @Override
    public void draw() {
        System.out.println("This figure is right triangle: color: " + color + ", first leg: " + roundToTwoDecimals(firstLeg)
                + ", second leg: " + roundToTwoDecimals(secondLeg) + ", area:" + roundToTwoDecimals(getArea()) + ".");
    }
}