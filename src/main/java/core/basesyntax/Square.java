package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private final double side;

    {
        setName("square");
    }

    public Square(Color color, double side) {
        super(color);
        this.side = side;
    }

    public Square() {
        super(new ColorSupplier().getRandomColor());
        this.side = new Random().nextInt(Figure.MAX_RANDOM_SIDE_VALUE);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.printf("Figure: %s, area: %.1f sq.units, side: %.1f units, color: %s\n",
                getName(), getArea(), side, getColor());
    }
}
