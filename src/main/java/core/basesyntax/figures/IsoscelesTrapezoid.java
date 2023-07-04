package core.basesyntax.figures;

import core.basesyntax.ColorEnum;

public class IsoscelesTrapezoid extends Figure {
    private final int bottomSide;
    private final int topSide;
    private final int height;

    public IsoscelesTrapezoid(ColorEnum color, int bottomSide, int topSide, int height) {
        super(color);
        this.bottomSide = bottomSide;
        this.topSide = topSide;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return height * (bottomSide + topSide) / 2;
    }

    public void draw() {
        System.out.println("Figure: " + "isosceles trapezoid, "
                + "area: " + calculateArea() + " sq.units, "
                + "bottom side: " + bottomSide + " units, "
                + "top side: " + topSide + " units, "
                + "height: " + height + " units, "
                + "color: " + color.name().toLowerCase()
        );
    }
}
