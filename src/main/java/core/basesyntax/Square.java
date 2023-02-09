package core.basesyntax;

import java.util.Locale;

public class Square extends Figure {
    private int side;

    public Square(int side) {
        super();
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + this.area()
                + " sq.units, side: " + this.side + " units, color: "
                + super.getColor().toLowerCase(Locale.ROOT));
    }

    @Override
    public double area() {
        return Math.pow(side, 2);
    }
}
