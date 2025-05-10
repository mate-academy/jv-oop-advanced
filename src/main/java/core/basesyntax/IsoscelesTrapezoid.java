package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private static final double FORMULA_CONSTANT = 0.5;
    private double firstSide;
    private double secondSide;
    private double height;

    public IsoscelesTrapezoid(double firstSide, double secondSide,
                              double heigth, Color color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = heigth;
        this.color = color;
        area = getArea();
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) * FORMULA_CONSTANT * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: " + area
                + " sq.units, first side: " + firstSide
                + " units,  second side " + secondSide + " units, height: "
                + height + " units, color: " + color);
    }
}
