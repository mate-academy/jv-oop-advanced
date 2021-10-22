package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int side;
    private int side2;

    public IsoscelesTrapezoid(int height, int side, int side2, String color) {
        super(color);
        this.height = height;
        this.side = side;
        this.side2 = side2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    @Override
    public int getArea() {
        return (side + side2) * height / 2;
    }

    @Override
    public void printInfo() {
        System.out.printf("Figure: Isosceles Trapezoid  , area: %s sq.units, firstSide: %s units, "
                        + "secondSide: %s units, " + "height: %s units, color: %s%n",
                getArea(), side, side2, height, getColor());
    }
}
