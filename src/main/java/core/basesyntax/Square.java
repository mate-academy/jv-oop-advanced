package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = getRandom().nextInt(Max_Value);
    }
    @Override
    public String toString() {
        return "Square {" +
                "side: " + side + " units" +
                ", color: " + color +
                ", area: " + getArea() + " sq.units" +
                '}';
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

