package core.basesyntax.figures;

import core.basesyntax.Figure;
import java.util.Random;

public class Square extends Figure {
    private double side;

    public Square() {
        super();
        this.side = Math.round(new Random().nextDouble(100) * 10.0) / 10.0;
    }

    public Square(double side) {
        super();
        this.side = Math.round(side * 10.0) / 10.0;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea()
                + " sq. units, side: " + side
                + " units, color: " + getColor());
    }
}
