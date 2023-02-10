package core.basesyntax;

import java.util.Locale;

public class Square extends Figure {
    private int side;

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + this.getArea()
                + " sq.units, side: " + this.side + " units, color: "
                + super.getColor().toLowerCase(Locale.ROOT));
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }
}
