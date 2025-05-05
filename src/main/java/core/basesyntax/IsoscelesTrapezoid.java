package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;

    public IsoscelesTrapezoid(String color, double firstSide, double secondSide, double height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    public double getFirstSide() {
        return firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (firstSide + secondSide) * height;
    }

    @Override
    public void draw() {
        System.out.println(String.format("Figure: isosceles trapezoid, area: %.1f "
                        + "sq.units, firstSide: %.1f, secondSide:"
                        + "%.1f, height: %.1f, color: %s", calculateArea(), getFirstSide(),
                getSecondSide(), getHeight(), getColor()));
    }
}
