package core.basesyntax.figures;

import core.basesyntax.Figure;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int firstBase;
    private int secondBase;

    public IsoscelesTrapezoid(int height, int firstBase, int secondBase, String color) {
        super(color);
        this.height = height;
        this.firstBase = firstBase;
        this.secondBase = secondBase;
    }

    @Override
    public double getArea() {
        return ((firstBase + secondBase) / 2) * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName().toLowerCase()
                + ", area: " + getArea() + " sq.units, height: " + height + " units, firstBase: "
                + firstBase + " units, secondBase: " + secondBase + " units, color: "
                + getColor());
    }
}