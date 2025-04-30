package core.basesyntax.figures;

import core.basesyntax.util.Color;

public class Rectangle extends Figure {
    private int sidea;
    private int sideb;

    public Rectangle(Color color, int sidea, int sideb) {
        super(color);
        this.sidea = sidea;
        this.sideb = sideb;
    }

    @Override
    public double calculateArea() {
        return this.sidea * this.sideb;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + calculateArea()
                + " sq. units, " + "side a: " + sidea
                + " side b: " + sideb + " units, color: " + getColor());
    }
}
