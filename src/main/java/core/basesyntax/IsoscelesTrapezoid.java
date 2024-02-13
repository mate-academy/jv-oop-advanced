package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(String color, int firstSide, int secondSide, int height) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
    }

    @Override
    public String getPrint() {
        return "Figure:  isosceles trapezoid, area: " + calculateArea() + "sq. units, "
                + " side a: " + firstSide + " units, "
                + " side b: " + secondSide + " units, " + " height: "
                + height + " units, " + "color: " + getColor();
    }

    @Override
    public double calculateArea() {
        return (firstSide + secondSide) / 2 * height;
    }
}
