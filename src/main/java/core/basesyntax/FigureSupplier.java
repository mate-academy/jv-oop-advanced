package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int COUNTER_FIGURE = 5;
    private final Random random = new Random();
    private final NumberSupplier numberSupplier = new NumberSupplier(random);
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int randomNumber = random.nextInt(COUNTER_FIGURE);

        switch (randomNumber) {
            case 0 :
                return new Circle(
                        colorSupplier.getRandomColor(),
                        numberSupplier.generateRandomNumber());
            case 1 :
                return new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        numberSupplier.generateFirstRandomNumberForTrapezoid(),
                        numberSupplier.generateSecondRandomNumberForTrapezoid());

            case 2 :
                return new Rectangle(
                        colorSupplier.getRandomColor(),
                        numberSupplier.generateRandomNumber(),
                        numberSupplier.generateRandomNumber());

            case 3 :
                return new RightTriangle(
                        colorSupplier.getRandomColor(),
                        numberSupplier.generateRandomNumber(),
                        numberSupplier.generateRandomNumber());

            case 4 :
                return new Square(
                        colorSupplier.getRandomColor(),
                        numberSupplier.generateRandomNumber());

            default:
                return getDefaultFigure();
        }
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE.name(),10);
    }
}
