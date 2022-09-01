package core.basesyntax;

public class IsoscelesTrapezoid extends Figure{
    private int height;
    private int upSide;
    private int bottom;
    public IsoscelesTrapezoid(String color, int height, int upSide, int bottom) {
        super(color);
        this.height = height;
        this.upSide = upSide;
        this.bottom = bottom;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getUpSide() {
        return upSide;
    }

    public void setUpSide(int upSide) {
        this.upSide = upSide;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    @Override
    public double getArea() {
        return (upSide + bottom) / 2 * height;
    }

    @Override
    public void drawable() {
        System.out.println("This figure is Isosceles Trapezoid with area: " + getArea() + " square units, " +
                "with properties: " + getBottom() + ", " +
                getHeight() + ", " +
                getUpSide());
    }
}
