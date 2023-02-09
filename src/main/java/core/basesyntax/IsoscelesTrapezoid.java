package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(int firstSide, int secondSide, int height, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
        super.setColor(color);
    }

    @Override
    public double getArea() {
        return ((firstSide + secondSide) / 2) * height;
    }

    @Override
    public String toString() {
        return "IsoscelesTrapezoid{"
                + "area=" + getArea()
                + ", firstSide=" + firstSide
                + ", secondSide=" + secondSide
                + ", height=" + height
                + ", color=" + getColor() + '}';
    }
}
