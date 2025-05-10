package core.basesyntax.domain;

import core.basesyntax.domain.parent.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final double shortSide;
    private final double longSide;
    private final double height;

    public IsoscelesTrapezoid(String color, double height, double shortSide, double longSide) {
        super(color);
        this.shortSide = shortSide;
        this.longSide = longSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return ((shortSide + longSide) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.printf(getClass().getSimpleName().toLowerCase() + ", area: %s sq. units, "
                        + "short side: %s units, long side %s units, height %s units, color: %s%n",
                calculateArea(), shortSide, longSide, height, color);
    }
}
