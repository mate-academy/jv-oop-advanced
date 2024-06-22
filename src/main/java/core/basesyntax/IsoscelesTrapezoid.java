package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstLeg;
    private double secondLeg;
    private double height;

    public IsoscelesTrapezoid(String color, double firstLeg, double secondLeg, double height) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
        this.height = height;
    }

    @Override
    public double getArea() {
        return ((firstLeg + secondLeg) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: isosceles trapezoid, area: %.2f sq. cm, firstLeg: %.2f cm, "
                + "secondLeg: %.2f cm, height: %.2f cm, color %s.%n", getArea(), firstLeg,
                secondLeg, height, color);
    }
}
