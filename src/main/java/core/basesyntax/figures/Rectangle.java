package core.basesyntax.figures;

import core.basesyntax.util.Colors;

public class Rectangle extends Figure {
    private int sidea;
    private int sideb;

    public Rectangle(Colors color) {
        super(color);
        this.sidea = getRandomNum();
        this.sideb = getRandomNum();
    }

    @Override
    public double getArea() {
        return this.sidea * this.sideb;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Rectangle, area: " + getArea()
                + " sq. units, " + "side a: " + sidea
                + " side b: " + sideb + " units, color: " + getColor());
    }
}
