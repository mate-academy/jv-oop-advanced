package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int baseSide;
    private final int topSide;
    private final int height;

    public IsoscelesTrapezoid(String name, String color,
                              int firstSide, int secondSide, int height) {
        super(name, color);
        this.height = height;
        if (secondSide > firstSide) {
            this.baseSide = secondSide;
            this.topSide = firstSide;
        } else {
            this.baseSide = firstSide;
            this.topSide = secondSide;
        }
    }

    public int getBaseSide() {
        return baseSide;
    }

    public int getTopSide() {
        return topSide;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (double) (height / 2) * (topSide + baseSide);
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea()
                + " sq.units, baseSide: " + getBaseSide()
                + " units, topSide: " + getTopSide()
                + " units, height: " + getHeight()
                + " units, color: " + getColor());
    }
}
