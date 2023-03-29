package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private static final int MAX_SIDE = 25;
    private int firstSide;
    private int secondSide;

    public Rectangle() {

    }

    public Rectangle(String color, int firstSide, int secondSide) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double getArea() {
        return firstSide * secondSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area: " + getArea() + " sq.units, firstSide: "
                + firstSide + " units, secondSide: " + secondSide
                + " units, color: " + getColor().toLowerCase());
    }

    @Override
    public Figure createRandomFigure() {
        Random random = new Random();
        return new Rectangle(new ColorSupplier().getRandomColor(),
                random.nextInt(MAX_SIDE), random.nextInt(MAX_SIDE));
    }
}
