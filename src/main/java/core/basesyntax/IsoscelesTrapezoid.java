package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double smallerSide;
    private double biggerSide;
    private double height;

    public IsoscelesTrapezoid(String color, double smallerSide, double biggerSide, double height) {
        super(color);
        this.smallerSide = smallerSide;
        this.biggerSide = biggerSide;
        this.height = height;
    }

    @Override
    public double areaCalculator() {
        return smallerSide * biggerSide * height / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + areaCalculator() + " sq. units, "
                + "smaller side: " + smallerSide + "units, bigger side: " + biggerSide
                + "units, height: " + height + "units, color: " + getColor());
    }
}
