package core.basesyntax;

import java.util.Random;

public class Square extends Figure {
    private Random random = new Random();
    private ColorSupplier colorSupplier = new ColorSupplier();

    private double side;

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public void generateRandomParameters() {
        name = "Square";
        side = random.nextDouble() * 20;
        color = colorSupplier.getRandomColor();
    }

    @Override
    public void generateDefaultParameters() {
        name = "Square";
        side = 5;
        color = "Black";
    }

    @Override
    public void printInfo() {
        System.out.println("Figure: " + getName()
                + ", " + "area: " + calculateArea()
                + ", " + "side: " + getSide()
                + ", " + "color: " + getColor());
        super.printInfo();
    }

    public double getSide() {
        return side;
    }
}
