package core.basesyntax;

public class IsoscelesTrapezoid extends Figure implements AreaCalculator {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(int firstSide, int secondSide, int height, Color color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: isoscelesTrapezoid, area: "
                + String.format("%.1f", this.getArea())
                + " sq.units, firstSide: " + this.firstSide
                + " units, secondSide: " + this.secondSide + " units, height: " + this.height
                + " units, color: " + this.color.toString().toLowerCase());
    }
}
