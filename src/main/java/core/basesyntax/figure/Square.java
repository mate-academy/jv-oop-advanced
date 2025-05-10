package core.basesyntax.figure;

import core.basesyntax.behaviour.Figure;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super.setColor(color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: Isosceles Trapezoid, "
                + "area: " + this.getArea() + " sq.units, "
                + "side: " + this.side + " units, "
                + "color: " + super.getColor());
    }
}
