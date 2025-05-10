package core.basesyntax.figures;

import core.basesyntax.enums.Color;

public class Square extends Figure {
    private int side;

    public Square(String name, int side, Color color) {
        super(name, color);
        this.side = side;
    }

    public int getSide() {
        return this.side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getName()
                + ", color: " + getColor()
                + ", area: " + format.format(getArea()) + " sq. units, "
                + "side: " + getSide() + " units");
    }

    @Override
    public double getArea() {
        return Math.pow(getSide(), 2);
    }
}
