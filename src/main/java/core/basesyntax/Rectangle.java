package core.basesyntax;

import java.util.Random;

public class Rectangle extends Figure {

    private double sideA;

    private double sideB;

    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random random = new Random();

    @Override
    public double calculateArea() {
        return sideA * sideB;
    }

    @Override
    public void generateRandomParameters() {
        sideA = random.nextDouble() * 20;
        sideB = random.nextDouble() * 20;
        name = "Rectangle";
        color = colorSupplier.getRandomColor();
    }

    @Override
    public void generateDefaultParameters() {
        sideA = 5;
        sideB = 10;
        color = "Orange";
        name = "Rectangle";
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName()
                + ", " + "area: " + calculateArea()
                + ", " + "sideA: " + getSideA()
                + ", " + "sideB: " + getSideB()
                + ", " + "color: " + getColor());
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }
}
