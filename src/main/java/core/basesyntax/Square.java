package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private int side;

    public Square() {
        this.side = new Random().nextInt(15);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, side: " + side + ", area: "
                + getArea() + ", color: " + getColor());
    }
}
