package core.basesyntax.figures;

import core.basesyntax.dataprocessor.ColorSupplier;

public class IsoscelesTrapezoid extends Figure {
    private final int height;
    private final int upperBase;
    private final int bottomBase;

    public IsoscelesTrapezoid(String color, int upperBase, int bottomBase, int height) {
        super(color);
        this.upperBase = upperBase;
        this.bottomBase = bottomBase;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getUpperBase() {
        return upperBase;
    }

    public int getBottomBase() {
        return bottomBase;
    }

    @Override
    public double area() {
        return (float) ((getUpperBase() + getUpperBase()) / 2) * getHeight();
    }

    @Override
    public void draw() {
        ColorSupplier colorSupplier = new ColorSupplier();
        System.out.println("Figure: isosceles trapezoid, area: " + area()
                + " sq.unit, bottom base: " + getBottomBase()
                + " units, upper base: " + getUpperBase()
                + " units, height: " + getHeight() + " units, color: "
                + colorSupplier.getRandomColor());
    }
}
