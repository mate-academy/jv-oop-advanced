package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private static final int MAX_NUMBER = 100;
    private int side;
    private final Random random = new Random();
    private final ColorSupplier color = new ColorSupplier();

    public Square(String color, int side) {
        super(color);
        this.side = side;
    }

    public Square getRandomSquare() {
        int side = random.nextInt(MAX_NUMBER);
        return new Square(color.getRandomColor(), side);
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
