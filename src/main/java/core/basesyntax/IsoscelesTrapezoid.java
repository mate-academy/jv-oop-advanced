package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int shortSide;
    private int longSide;
    private int height;

    public IsoscelesTrapezoid(String color, int shortSide, int longSide, int height) {
        super(color);
        this.shortSide = shortSide;
        this.longSide = longSide;
        this.height = height;
    }

    public int getShortSide() {
        return shortSide;
    }

    public void setShortSide(int shortSide) {
        this.shortSide = shortSide;
    }

    public int getLongSide() {
        return longSide;
    }

    public void setLongSide(int longSide) {
        this.longSide = longSide;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Isosceles Trapezoid has a short side: " + shortSide + ", long side: "
                + longSide + ", height: " + height + " and has an area: " + getArea());
    }

    @Override
    public double getArea() {
        return (double) (longSide + shortSide) / 2 * height;
    }
}
