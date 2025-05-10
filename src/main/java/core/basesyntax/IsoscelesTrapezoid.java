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
    public double getArea() {
        return Math.floor(((firstSide + secondSide) / 2.0) * height);
    }

    public void toDraw() {
        System.out.println("isosceles trapezoid, area: " + getArea() + " sq.units, firstSide: "
                + firstSide + " units, secondSide: " + secondSide + " units, height: "
                + height + " units, color: " + getColor());
    }
}
