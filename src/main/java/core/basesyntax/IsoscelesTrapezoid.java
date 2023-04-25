package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(Color color, int firstSide, int secondSide, int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    public void setFirstSide(int firstSide) {
        this.firstSide = firstSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (firstSide + secondSide) * height;
    }

    @Override
    public String draw() {
        return "Figure: isosceles trapezoid, area: " + String.format("%.1f", calculateArea())
                + " sq.units, side: " + firstSide
                + " units, side: " + secondSide
                + " units, height: " + height
                + " units, color: " + getColor();
    }
}
