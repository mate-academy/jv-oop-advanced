package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Rectangle() {

    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public void print() {
        System.out.println("Figure: rectangle, area: " + getArea()
                + " sq.units, side a: " + getSideA()
                + " units, side b: " + getSideB()
                + " units, color: " + getColor());
    }

    @Override
    public Figure getRandomFigure() {
        ColorSupplier supplier = new ColorSupplier();
        Random random = new Random();
        return new Rectangle(supplier.getRandomColor(), random.nextInt(100), random.nextInt(100));
    }
}
