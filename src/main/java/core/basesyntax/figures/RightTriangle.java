package core.basesyntax.figures;

import core.basesyntax.util.Color;

public class RightTriangle extends Figure {
    private int kat;
    private int kat1;

    public RightTriangle(Color color, int kat, int kat1) {
        super(color);
        this.kat = kat;
        this.kat1 = kat1;
    }

    @Override
    public double calculateArea() {
        return this.kat * kat1 / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Right Triangle, area: " + calculateArea()
                + " sq. units, " + " side a: " + kat
                + " side b: " + kat1 + " units, color: " + getColor());
    }
}
