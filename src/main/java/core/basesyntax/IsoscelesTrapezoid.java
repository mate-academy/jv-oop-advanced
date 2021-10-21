package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int upperSide;
    private int lowerSide;
    private int height;

    public IsoscelesTrapezoid(String color, int upperSide, int lowerSide, int height) {
        super(color);
        this.upperSide = upperSide;
        this.lowerSide = lowerSide;
        this.height = height;
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
    public double areaInfo() {
        return (upperSide + lowerSide) / 2 * height;
    }

    @Override
    public void drawInfo() {
        System.out.println("Figure: rectangle, area: "
                + areaInfo() + " sq.units, upper side: "
                + getUpperSide() + " units, lower side: "
                + getLowerSide() + " units, height: "
                + getHeight() + " units, color: "
                + getColor());
    }
}
