package core.basesyntax.figures;

import core.basesyntax.templates.Drawable;
import core.basesyntax.templates.Figure;

public class Square extends Figure implements Drawable {
    private int side;

    public Square(String color, int side) {
        super(color);
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
        return (double) side * 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area:" + getArea()
                + " sq. units, side: " + getSide()
                + " units, color: " + getColor());
    }
}
