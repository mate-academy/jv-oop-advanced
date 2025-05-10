package core.basesyntax.figures;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;

    public IsoscelesTrapezoid(double firstSide, double secondSide, double height, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
        this.setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Figure: isosceles trapezoid, area: "
                + area() + " units, first side : " + firstSide
                + " units, second side : " + secondSide + " units, height : "
                + height + " units, color: " + getColor());
    }

    @Override
    public double area() {
        return (firstSide + secondSide) / 2 * height;
    }
}
