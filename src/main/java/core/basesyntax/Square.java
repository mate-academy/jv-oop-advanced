package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private int side;
    private static final int MAX_NUMBER = 100;
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Square getRandomSquare() {
        int side = random.nextInt(MAX_NUMBER);
        return new Square(color.getRandomColor(), side);
    }

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Square = {" + "color: " + getColor() + ", side: " + getSide()
                + ", area: " + getArea() + "}");
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
