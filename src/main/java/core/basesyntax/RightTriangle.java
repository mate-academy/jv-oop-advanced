package core.basesyntax;

public class RightTriangle extends Figure {
    private double shortSide;
    private double longSide;

    public RightTriangle(String color, double shortSide, double longSide) {
        super(color);
        this.shortSide = shortSide;
        this.longSide = longSide;
    }

    @Override
    public double getArea() {
        return (longSide * shortSide) / 2;
    }

    @Override
    public void draw() {
        System.out.println("This is righttriangle, shortSide: " + shortSide
                + " longSide: " + longSide + " color: " + getColor());
    }
}
