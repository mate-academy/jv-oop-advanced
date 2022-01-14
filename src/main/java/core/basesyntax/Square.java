package core.basesyntax;

import java.util.Random;

public class Square extends Figure implements GetArea {
    private Random random = new Random();
    private ColorSupplier color = new ColorSupplier();
    private int side;

    public Square() {
        setName("square");
        setColor(color.getRandomColor().toString());
        this.side = random.nextInt(100);
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String drawFigure() {
        return "Figure: " + getName()
                + ", area: " + getArea()
                + " sq.units, side: " + side
                + " units, color: " + getColor().toLowerCase();
    }
}
