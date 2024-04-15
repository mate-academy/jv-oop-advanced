package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int firstSide;
    private int secondSide;
    private int height;

    public IsoscelesTrapezoid(int firstSide, int secondSide, int height, String color) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.height = height;
        setColor(color);
    }

    @Override
    public int area() {
        return (int) ((firstSide + secondSide) * height) / 2;
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Figure: isoscelesTrapezoid,"
                + " area: " + area() + " sq. units"
                + ", firstSide: " + firstSide + " units"
                + ", secondSide: " + secondSide + " units"
                + ", height: " + height + " units"
                + ", color: " + getColor();

    }
}
