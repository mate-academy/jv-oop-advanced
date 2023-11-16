package core.basesyntax;

public class RightTriangle extends Figure {
    private final double firstLeg;
    private final double secondLeg;

    public RightTriangle(double firstLeg, double secondLeg, String color) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double getArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure" + " " + "RightTriangle" + " " + "FirstLeg" + " " + firstLeg + " "
                + "SecondLeg" + " " + secondLeg + " " + "Area" + " " + getArea()
                + " " + "Color" + " " + color);
    }
}
