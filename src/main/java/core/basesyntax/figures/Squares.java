package core.basesyntax.figures;

import core.basesyntax.AreaFigure;
import core.basesyntax.Figure;

public class Squares extends Figure implements AreaFigure {
    private int side;

    public Squares(String color, int side) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square"
                + ", area: " + getArea() + " sq.units,"
                + " side: " + getSide() + " units,"
                + " color: " + getColor());
    }

    @Override
    public double getArea() {
        return side * side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
}
