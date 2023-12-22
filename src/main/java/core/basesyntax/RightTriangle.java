package core.basesyntax;

import java.util.Random;

public class RightTriangle extends Figure {
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    private double cat1;
    private double cat2;

    @Override
    public double calculateArea() {
        return (cat1 * cat2) / 2;
    }

    @Override
    public void generateRandomParameters() {
        cat1 = random.nextDouble() * 20;
        cat2 = random.nextDouble() * 20;
        name = "RightTriangle";
        color = colorSupplier.getRandomColor();
    }

    @Override
    public void generateDefaultParameters() {
        cat1 = 3;
        cat2 = 4;
        color = "Green";
        name = "RightTriangle";
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName()
                + ", " + "area: " + calculateArea()
                + ", " + "cat1: " + getCat1()
                + ", " + "cat2: " + getCat2()
                + ", " + "color: " + getColor());
    }

    public double getCat1() {
        return cat1;
    }

    public double getCat2() {
        return cat2;
    }
}
