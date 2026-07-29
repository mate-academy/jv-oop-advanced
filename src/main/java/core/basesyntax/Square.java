package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private final int side;

    public Square() {
        Random random = new Random();
        this.side = random.nextInt(1, 10);
        this.color = new ColorSupplier().getRandomColor();
    }

    public Square(int side, String color) {
        this.side = side;
        this.color = color;
    }

    @Override
    public double getArea() {
        return (double) side * (double) side;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + this.getArea()
                + " sq. units, side: " + this.side
                + " units, color: " + this.color);
    }
}
