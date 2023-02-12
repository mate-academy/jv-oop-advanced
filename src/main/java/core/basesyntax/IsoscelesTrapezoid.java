package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private double height;
    private double area;

    public IsoscelesTrapezoid(double firstSide, double secondSide, double height, Color color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
        this.setColor(color);
    }

    @Override
    public double calculateArea() {
        return ((firstSide + secondSide) * height) / 2;
    }

    @Override
    public void drawTheInformation() {
        System.out.println("Figure: isosceles trapezoid, area: " + calculateArea()
                + " sq.units, first side: " + firstSide + "units, second side: " + secondSide
                + "units, height: " + height
                + "units, color: " + getColor());
    }
}
