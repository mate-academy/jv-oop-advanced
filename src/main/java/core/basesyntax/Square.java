package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private int side;

    public Square(int side, String color) {
        this.setShape("Square");
        this.setColor(color);
        this.side = side;
    }

    public Square() {
        this.side = new Random().nextInt(100);
        this.setShape("Square");
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return side * side;
    }

    @Override
    public void printInfo() {
        System.out.printf("Figure: %s , area: %s sq.units, side: %s units, "
                + "color: %s%n", getShape(), getArea(), getSide(), getColor());
    }
}
