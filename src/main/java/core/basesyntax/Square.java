package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private int side;

    public Square(Color color, int side) {
        super(color);
        this.side = random.nextInt(Max_Value);
    }
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color=" + color +
                ", area=" + getArea() +
                '}';
    }

    @Override
    public double getArea() {
        return side * side;
    }
}

