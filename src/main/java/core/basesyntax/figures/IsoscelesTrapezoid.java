package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private final int firstBase;
    private final int secondBase;
    private final int height;

    public IsoscelesTrapezoid(String color,
                              int firstBase,
                              int secondBase,
                              int height) {
        super(color);
        this.firstBase = firstBase;
        this.secondBase = secondBase;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Figure: "
                + IsoscelesTrapezoid.class.getSimpleName()
                + ", area: "
                + getArea()
                + " sq.units, firstBase: "
                + firstBase
                + " units, secondBase: "
                + secondBase
                + " units, height: "
                + height
                + " units, color: "
                + getColor();
    }

    @Override
    public double getArea() {
        return 0.5 * (firstBase + secondBase) * height;
    }

    @Override
    public void draw() {
        System.out.println(this.toString());
    }
}
