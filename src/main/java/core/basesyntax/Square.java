package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private int side;

    public Square() {
        super();
        this.side = new Random().nextInt(100);
    }

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    @Override
    public void drawFigure() {
        System.out.println("Figure: Square, area: "
                + String.format("%.2f", this.getArea()) + " sq. units, side: "
                + side + " units, color: "
                + this.getColor());
    }
}
