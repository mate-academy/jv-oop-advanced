package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private int side;

    public Square() {
        super();
        this.side = new Random().nextInt(10);
    }

    @Override
    public void draw() {
        System.out.println("square, area: " + this.getArea() + " sq.units, side: "
                           + this.side + " units, color: " + super.getColor());
    }

    @Override
    public double getArea() {
        return this.side * this.side;
    }
}
