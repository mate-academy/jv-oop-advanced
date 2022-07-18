package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private static final int MAX_SIDE = 20;
    private int side;

    public Square(int side, String color) {
        super(color);
        this.side = side;
    }

    public Square() {
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + getClass().getSimpleName().toLowerCase()
                + ", area: " + getArea() + ", side: " + side + ", color: " + getColor() + ".");
    }

    public static Square getRandomSquare() {
        Random random = new Random();
        ColorSupplier colorSupplier = new ColorSupplier();
        return new Square(random.nextInt(MAX_SIDE), colorSupplier.getRandomColor());
    }
}
