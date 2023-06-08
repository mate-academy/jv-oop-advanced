package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private double firstSide;
    private double secondSide;
    private int height;

    public double getFirstSide() {
        return firstSide;
    }

    public void setFirstSide(double firstSide) {
        this.firstSide = firstSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(double secondSide) {
        this.secondSide = secondSide;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, firstSide: %.1f units,"
                        + "secondSide: %.1f units, height: %d units, color: %s%n",
                getClass().getSimpleName().toLowerCase(),
                getArea(), firstSide, secondSide, height, getColor().name().toLowerCase());
    }

    @Override
    public double getArea() {
        return (firstSide + secondSide) / 2 * height;
    }
}
