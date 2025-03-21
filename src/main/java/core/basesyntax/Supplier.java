package core.basesyntax;

import java.util.Random;

public class Supplier {

    private Random random = new Random();
    private ColorRandom colorSupplier = new ColorRandom();

    public Figure getRandomFigure() {
        return switch (random.nextInt(5)) {
            case 0 -> new Square(colorSupplier.getRandomColor(), random.nextDouble() * 10 + 1);
            case 1 ->
                    new Rectangle(colorSupplier.getRandomColor(), random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1);
            case 2 ->
                    new RightTriangle(colorSupplier.getRandomColor(), random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1);
            case 3 -> new Circle(colorSupplier.getRandomColor(), random.nextDouble() * 10 + 1);
            default ->
                    new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1, random.nextDouble() * 10 + 1);
        };
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }

}
