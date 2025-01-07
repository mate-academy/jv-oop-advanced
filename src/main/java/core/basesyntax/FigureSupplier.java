package core.basesyntax;

import java.util.Random;

public class FigureSupplier {

    private final Random random = new Random();

    private final int randomSize = random.nextInt(10);

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure(int index) {
        switch (index) {
            case 0: return new Square(colorSupplier.getRandomColor(), randomSize);
            case 1: return new Rectangle(colorSupplier.getRandomColor(),
                    randomSize, randomSize);
            default: return new RightTriangle(colorSupplier.getRandomColor(),
                    randomSize, randomSize);
//            case 3: return new Circle(colorSupplier.getRandomColor(), RANDOM_SIZE);
//            default: return new IsoscelesTrapezoid(colorSupplier.getRandomColor(),
//                    RANDOM_SIZE, RANDOM_SIZE, RANDOM_SIZE);
        }
    }

    public Figure getDefaultFigure(int index) {
        switch (index) {
            case 4 : return new Circle("WHITE", 10);
            default : return new IsoscelesTrapezoid("BLUE",10,10,10);

        }
    }
}

