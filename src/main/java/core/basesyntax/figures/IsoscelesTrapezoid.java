package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class IsoscelesTrapezoid extends Figure {
    private int baseUp;
    private int baseDown;
    private int height;

    public IsoscelesTrapezoid(Color color, int baseUp, int baseDown, int height) {
        super(color);
        this.baseUp = baseUp;
        this.baseDown = baseDown;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: ISOSCELES TRAPEZOID, area: "
                + getArea()
                + " sq.units, "
                + "base UP: "
                + baseUp
                + " units,"
                + "base DOWN: "
                + baseDown
                + " units,"
                + " height: "
                + height
                + " units, color: "
                + getColor());
    }

    @Override
    public double getArea() {
        return height * (baseDown + baseUp) * 0.5;
    }
}
