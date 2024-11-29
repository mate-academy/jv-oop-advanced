package core.basesyntax;

import java.util.Random;

public class ShapeSupplier {
    private final int defaultSize = 20;
    private final int maxSize = 100;
    private final int maxBound = 10;
    private ColorSupplier colorSupplier = new ColorSupplier();
    private Random randomizer = new Random();

    private int randomSize() {
        return 1 + randomizer.nextInt();
    }

    public Shape getRandomShape() {
        int index = randomizer.nextInt(maxBound);
        switch (index) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), randomSize());
            case 1:
                return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
                        randomSize(), randomSize(), randomSize());
            case 2:
                return new Rectangle(colorSupplier.getRandomColor(),
                        randomSize(), randomSize());
            case 3:
                return new RightTriangle(colorSupplier.getRandomColor(),
                        randomSize(), randomSize());
            default:
                return new Square(colorSupplier.getRandomColor(), randomSize());
        }
    }

    public Shape getDefaultShape() {
        return new Square(String.valueOf(Colors.RED), defaultSize);
    }
}

