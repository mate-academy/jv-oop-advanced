package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperSide;
    private int lowerSide;
    private int height;

    public IsoscelesTrapezoid() {
    }

    public IsoscelesTrapezoid(int upperSide, int lowerSide, int height, String color) {
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
        this.height = height;
        this.color = color;
    }

    public int getUpperSide() {
        return upperSide;
    }

    public int getLowerSide() {
        return lowerSide;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (upperSide + lowerSide) / 2.0 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: trapezoid, area: " + getArea()
                + " sq.units, upperSide: " + upperSide + " units, lowerSide: "
                + lowerSide + " units, height: " + height + " units, color: " + color);
    }
}
